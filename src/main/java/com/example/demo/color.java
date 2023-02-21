package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class color {
     private String Color="black";
	@GetMapping("/color")
	public String getcolor() {
		return "favourite colour"+Color;
	}
}
