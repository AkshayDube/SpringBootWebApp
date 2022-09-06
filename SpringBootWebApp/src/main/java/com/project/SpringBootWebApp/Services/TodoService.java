package com.project.SpringBootWebApp.Services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.SpringBootWebApp.Entities.Todo;

@Service
public class TodoService {

	private static List<Todo> todos =new ArrayList<>();
	
	static {
		todos.add(new Todo(1,"Akshay","Knight Pearl",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(2,"Rajul","Royal Challneger",LocalDate.now().plusYears(2),true));
		todos.add(new Todo(3,"Naresh","Pink Panthers",LocalDate.now().plusYears(3),false));
	}
	
	public List<Todo> getListOfTodosByUsername(String username){
		return todos;
	}
	
}
