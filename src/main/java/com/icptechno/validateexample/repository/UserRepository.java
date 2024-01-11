package com.icptechno.validateexample.repository;

import com.icptechno.validateexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(int uId);
}
