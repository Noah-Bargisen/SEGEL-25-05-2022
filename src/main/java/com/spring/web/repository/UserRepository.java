package com.spring.web.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.web.model.UserModel;



@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
  Optional<UserModel> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);
}
