package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value= {"/exam"})
public class ExamRequestController 
{
	@RequestMapping(value= {"/request"})
	public String m1()
	{
		return "examrequest";
	}
}