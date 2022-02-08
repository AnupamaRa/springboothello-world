package com.javatpoint.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController
@RequestMapping("/foo") 
public class HelloWorldController   
{  
	@GetMapping("/bar")
public String hello()   
{  
return "Hello javaTpoint";  
}  
}  