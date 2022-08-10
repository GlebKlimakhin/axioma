package com.axioma.axiomatrainee.repository;

import com.axioma.axiomatrainee.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
