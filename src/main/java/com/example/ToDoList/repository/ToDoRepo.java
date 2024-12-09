package com.example.ToDoList.repository;

import com.example.ToDoList.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepo extends JpaRepository<ToDo, Long> {
}
