package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

@GetMapping("/")
public String sayHello()
{
	return "Hello world! Time on server is " + LocalDateTime.now();
}

// expose new end point
@GetMapping("/workout")
public String getWorkout()
{
	return "Run a hard 5k";
}

@GetMapping("/run")
public String getRunt()
{
	return "Running every day 10k";
}
}
