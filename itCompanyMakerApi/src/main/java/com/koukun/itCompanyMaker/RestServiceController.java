package com.koukun.itCompanyMaker;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServiceController {
	private static final String template = "%s";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/getCompanyName")
	public CompanyNameMaker getUrl(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new CompanyNameMaker(counter.incrementAndGet(), String.format(template, name));
	}
}
