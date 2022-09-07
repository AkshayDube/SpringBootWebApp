package com.project.SpringBootWebApp.Services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.SpringBootWebApp.Entities.Todo;

@Service
public class TodoService {

	private static List<Todo> todos =new ArrayList<>();
	
	private static int count=0;
	
	static {
		todos.add(new Todo(++count,"Akshay","Knight Pearl",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++count,"Rajul","Royal Challneger",LocalDate.now().plusYears(2),true));
		todos.add(new Todo(++count,"Naresh","Pink Panthers",LocalDate.now().plusYears(3),false));
	}
	
	public List<Todo> getListOfTodosByUsername(String username){
		return todos;
	}
	
	public void addTodo(String username,String description,LocalDate targetDate,boolean isDone) {
		todos.add(new Todo(++count,username,description,targetDate,isDone));
	}
	
}
