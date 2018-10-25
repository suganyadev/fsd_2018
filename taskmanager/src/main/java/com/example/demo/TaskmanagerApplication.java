package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TaskmanagerApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(TaskmanagerApplication.class, args);
		System.out.println("Am here ");
/*		TaskService taskService = ctx.getBean(TaskService.class);
		Date sqlStartDate = new Date(Calendar.getInstance().getTime().getTime());
*/		
	}
}
