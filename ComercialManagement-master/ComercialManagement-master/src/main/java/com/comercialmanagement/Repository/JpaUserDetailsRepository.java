package com.comercialmanagement.Repository;

import com.comercialmanagement.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaUserDetailsRepository extends JpaRepository <User,Long> {


   Optional<User> findByUsername(String username);
}
