package com.example.yebelo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.yebelo.entity.EntityClass;
import com.example.yebelo.services.YebeloService;

@RestController
@RequestMapping
public class YebeloController {
	@Autowired
	private YebeloService yebeloService;
	@GetMapping("/FetchNextNumber")
	public EntityClass getNumbers()
	{
		return yebeloService.getNumbers();
		
	}
}
