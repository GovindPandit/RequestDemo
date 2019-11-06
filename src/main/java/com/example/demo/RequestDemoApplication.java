package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.example.*")
public class RequestDemoApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(RequestDemoApplication.class, args);
	}
}
