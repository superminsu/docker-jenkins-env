package com.docker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

	@GetMapping("docker")
	public String testDocker() {
		return "test for docker start";
	}
	
	@GetMapping("third")
	public String testThirdCommit() {
		return "third commit";
	}
}
