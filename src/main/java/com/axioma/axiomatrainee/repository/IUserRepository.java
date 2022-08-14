package com.axioma.axiomatrainee.repository;

import com.axioma.axiomatrainee.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, Long> {

    Optional<User> findByFirstnameAndLastname(String firstname, String lastname);

    Optional<User> findByUsername(String username);

}
