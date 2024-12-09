package com.example.ToDoList.controller;

import com.example.ToDoList.model.ToDo;
import com.example.ToDoList.repository.ToDoRepo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class ToDoController {
    @Autowired
    private ToDoRepo toDoRepo;

    @GetMapping
    public List<ToDo> findAll(){
        return toDoRepo.findAll();
    }

    @PostMapping    //validation added(?)
    public ToDo save(@Valid @NotNull @RequestBody ToDo toDoItem){
        return toDoRepo.save(toDoItem);
    }
    @PutMapping
    public ToDo update(@Valid @NotNull @RequestBody ToDo toDoItem){
        return toDoRepo.save(toDoItem);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        toDoRepo.deleteById(id);
    }



}
