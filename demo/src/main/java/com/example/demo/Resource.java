package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Resource {
	
	@RequestMapping(value = "/rest")
	public Map<String, String> addBook() {
		Map<String, String> map = new HashMap<>();
		map.put("firstName", "Rahul");
		map.put("lastName", "Choudhary");
		return map;
	}

}
