package com.project.SpringBootWebApp.Controllers;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.project.SpringBootWebApp.Services.TodoService;

@SessionAttributes("username")
@Controller
public class TodosController {
	
	private TodoService todos;
	
	

	public TodosController(TodoService todos) {
		super();
		this.todos = todos;
	}



	@RequestMapping("todos")
	public String getTodos(ModelMap model) {
		model.addAttribute("todos",todos.getListOfTodosByUsername("Knight Pearl"));
		return "todos";
	}
	
	@RequestMapping("add-todo")
	public String addTodo(ModelMap model) {
		return "add-todo";
	}
	
	@RequestMapping(value="todos",method = RequestMethod.POST)
	public String getAllTodos(@RequestParam String description,ModelMap model) {
		todos.addTodo((String) model.getAttribute("username"),description,LocalDate.now().plusYears(1).plusMonths(6), false);
		model.addAttribute("todos",todos.getListOfTodosByUsername("Knight Pearl"));
		return "todos";
	}
}
