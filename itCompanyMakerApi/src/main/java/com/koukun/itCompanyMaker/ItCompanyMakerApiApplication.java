package com.koukun.itCompanyMaker;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.koukun.itCompanyMaker.*;

@SpringBootApplication
public class ItCompanyMakerApiApplication {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	public static void main(String[] args) {
		SpringApplication.run(ItCompanyMakerApiApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
	
	@GetMapping("/getCompanyName")
	public CompanyNameMaker getCompanyName(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new CompanyNameMaker(counter.incrementAndGet(), String.format(template, name));
	}
}
