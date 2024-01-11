package com.icptechno.validateexample.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "name shouldn't be null")
    private String name;
    @Email(message = "Provide a valid Email")
    private String email;
    @Pattern(regexp = "^\\d{10}$")
    private String mobile;
    private String gender;
    @Min(value = 18 , message = "Age should be greater than 18")
    @Max(value = 50 , message = "Age should be bellow 50")
    private int age;
    @NotBlank(message = "fill the nationality")
    private String nationality;
}
