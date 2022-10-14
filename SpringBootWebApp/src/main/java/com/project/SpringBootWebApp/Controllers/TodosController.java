package com.project.SpringBootWebApp.Controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.project.SpringBootWebApp.Entities.Todo;
import com.project.SpringBootWebApp.Services.TodoService;

@SessionAttributes("username")
@Controller
public class TodosController {
	
	@Autowired
	private TodoService todos;
	
	@RequestMapping("todos")
	public String getTodos(ModelMap model) {
		model.addAttribute("todos",todos.getListOfTodosByUsername("Knight Pearl"));
		return "todos";
	}
	
	//Mapping to load the ADD-Todo JSP page
	@RequestMapping("add-todo")
	public String addTodo(ModelMap model) {
		Todo todo=new Todo(0,(String) model.getAttribute("username"),"",LocalDate.now().plusYears(1).plusMonths(6),false);
		model.addAttribute("todo",todo);
		return "add-todo";
	}
	
	//Mapping for adding the todo to list
	@RequestMapping(path="add-todo",method = RequestMethod.POST)
	public String saveTodo(ModelMap model,Todo todo) {
		todos.addTodo((String) model.getAttribute("username"),todo.getDescription(),LocalDate.now().plusYears(1).plusMonths(6), false);
		model.addAttribute("todos",todos.getListOfTodosByUsername(""));
		return "todos";
	}
}
