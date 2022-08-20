package com.axioma.axiomatrainee.repository;

import com.axioma.axiomatrainee.model.Homework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHomeworkRepository extends JpaRepository<Homework, Long> {
}
