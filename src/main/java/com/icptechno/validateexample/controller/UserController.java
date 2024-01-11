package com.icptechno.validateexample.controller;

import com.icptechno.validateexample.dto.UserRequest;
import com.icptechno.validateexample.entity.User;
import com.icptechno.validateexample.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/v1/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest){
        return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.ACCEPTED);
    }

    @GetMapping("/getALlUsers")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers() , HttpStatus.ACCEPTED);
    }

    @GetMapping("/getUserById/{uId}")
    public ResponseEntity<User> getUserById(@PathVariable int uId){
        return new ResponseEntity<>(userService.getUserById(uId) , HttpStatus.ACCEPTED);
    }
}
