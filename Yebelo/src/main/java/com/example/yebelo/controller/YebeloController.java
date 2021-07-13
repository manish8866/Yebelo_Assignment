package com.example.yebelo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.yebelo.entity.EntityClass;
import com.example.yebelo.services.YebeloService;

@RestController
@RequestMapping
public class YebeloController {
	@Autowired
	private YebeloService yebeloService;
	@PostMapping("/FetchNextNumber")
	public EntityClass getNumbers(@RequestParam Integer categoryCode)
	{
		return yebeloService.getNumbers(categoryCode);
	}
	@PostMapping("/FetchNextNumber")
	public EntityClass save(EntityClass e)
	{
		return yebeloService.save(e);
		
	}
}
