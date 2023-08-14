package com.mockito.poc.service;

import java.util.List;

// External Service - Lets say this comes from WunderList
public interface TodoService {

	public List<String> retrieveTodos(String user);

	void deleteTodo(String todo);
	
	void addTodo(String todo);

}