package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Todo;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value = "/list")
  public String list(@RequestParam(value = "isActive", required = false) Boolean done, Model model){
    model.addAttribute("todos", todoRepository.getByDone(done));
    return "todoslist";
  }

  @RequestMapping(value = "/")
  public String listvmi(Model model){
    model.addAttribute("todos", todoRepository.findAll());
    return "todoslist";
  }

  @GetMapping("/add")
  public String getNewTodoForm(Model model){
    model.addAttribute("todo", new Todo());
    return "createtodo";
  }

  @PostMapping("/add")
  public String addNewTodo(@ModelAttribute Todo todo){
    todoRepository.save(todo);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/delete")
  public String deleteTodoById(@PathVariable("id") Long id){
    todoRepository.deleteById(id);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/edit")
  public String getEditTodoForm(Model model, @PathVariable("id") Long id){
    model.addAttribute("id", id);
    model.addAttribute("todo", todoRepository.findById(id).get());
    return "edittodo";
  }

  @PostMapping("/{id}/edit")
  public String editTodo(@ModelAttribute Todo todo, @PathVariable("id") Long id){
    todoRepository.save(todo);
    return "redirect:/todo/";
  }

  }

