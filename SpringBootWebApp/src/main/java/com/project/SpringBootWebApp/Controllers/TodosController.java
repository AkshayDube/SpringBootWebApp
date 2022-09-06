package com.project.SpringBootWebApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
