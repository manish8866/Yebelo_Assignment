package com.example.yebelo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.yebelo.entity.EntityClass;

@RestController
@RequestMapping
public class YebeloController {
	
	@GetMapping("/FetchNextNumber")
	public EntityClass getNumbers()
	{
		return null;
		
	}
}
