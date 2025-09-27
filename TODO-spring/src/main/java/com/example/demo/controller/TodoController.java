package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TodoModel;
import com.example.demo.service.TodoService;

@RestController
@RequestMapping("/api/todo")
@CrossOrigin(origins = "http://localhost:5173")
public class TodoController {
	@Autowired
	private TodoService todoService;

	@PostMapping("/create")
	public TodoModel createTodo(@RequestBody TodoModel todoModel) {
		return todoService.createTodo(todoModel);
	}

	@GetMapping("/alltodo")
	public List<TodoModel> getAllTodo() {
		return todoService.getAllTodos();
	}

	@GetMapping("/get/{id}")
	public TodoModel getTodo(@PathVariable int id) {
		return todoService.getTodo(id);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<TodoModel> updateTodo(@PathVariable int id, @RequestBody TodoModel todoModel) {
		return ResponseEntity.ok(todoService.updateTodo(id, todoModel));
	}

	@DeleteMapping("/delete/{id}")
	public String deleteTodo(@PathVariable int id) {
		todoService.deleteTodo(id);
		return "todo deleted";
	}
}
