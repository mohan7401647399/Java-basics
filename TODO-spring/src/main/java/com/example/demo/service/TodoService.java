package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TodoModel;
import com.example.demo.repository.TodoRepository;

@Service
public class TodoService {
	@Autowired
	private TodoRepository todoRepository;

	// get all todo's
	public List<TodoModel> getAllTodos() {
		return todoRepository.findAll();
	}

	// get single todo
	public TodoModel getTodo(int id) {
		return todoRepository.findById(id).orElseThrow();
	}

	// create a todo
	public TodoModel createTodo(TodoModel todoModel) {
		return todoRepository.save(todoModel);
	}

	// update todo
	public TodoModel updateTodo(int id, TodoModel todoModel) {
		TodoModel todo = todoRepository.findById(id).orElseThrow();
		todo.setName(todoModel.getName());
		todo.setCompleted(todoModel.getCompleted());
		return todoRepository.save(todo);
	}

	// delete todo
	public void deleteTodo(int id) {
		todoRepository.deleteById(id);
	}
}
