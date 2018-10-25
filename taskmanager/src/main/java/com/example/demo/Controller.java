package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	TaskService taskService;
	
	@RequestMapping("/")
	public void me() {
		System.out.println("invoke default");
	}
	
	
	@RequestMapping("/welcome")
	public  @ResponseBody String  welcome() {
		System.out.println("Welcome");
		return "Welcome";
	}
	
	/*@RequestMapping(value="/addTask", method = RequestMethod.POST, produces = "application/json")*/
	@RequestMapping(value="/addTask", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public String addTask(@RequestBody Task task) {
		taskService.addTask(task);
		return "SUCCESS";
	}
	
	@RequestMapping(value="/endTask/{task_id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public List<Task> endTask(@PathVariable int task_id) {
		taskService.endTask(task_id);
		return taskService.getAllTasks();
	}
	
	@RequestMapping(value="/editTask/{task_id}", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public String editTask(@RequestBody Task task, @PathVariable int task_id) {
		taskService.editTask(task);
		return "updated";
	}
	
	@RequestMapping(value="/viewTask", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Task> viewtask() {
		return taskService.getAllTasks();
	}
	
	
}
