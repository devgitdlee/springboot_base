package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.YamlProcessor.ResolutionMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MemberService;

import lombok.RequiredArgsConstructor;



@RestController
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/hello/{variable}")
	public String member(@PathVariable("variable") String var) {	
		return var;
	}
	@GetMapping("/hello2")
	public String member2(
			@RequestParam String name,
			@RequestParam String email,
			@RequestParam String orgenization) {	
		return name + " " + email + " " + orgenization ;
	}
	@GetMapping("/hello2")
	public String member2(
			@RequestBody Map<String, Object> map) {	
		return map.toString();
	}
	
	
	
	
}
