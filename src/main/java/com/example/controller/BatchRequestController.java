package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/batch")
public class BatchRequestController 
{
	@GetMapping(value= {"/request"})
	public String m1()
	{
		return "batchrequest";
	}
}
