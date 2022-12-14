package com.task.sie.app.tasksie.repository;

import com.task.sie.app.tasksie.model.user.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository  extends JpaRepository<Person, Long> {
}
