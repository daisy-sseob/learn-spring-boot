package me.sseob.learnspringboot.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	Logger log = LoggerFactory.getLogger(this.getClass());

	private final SampleService sampleService;

	@Autowired
	public SampleController(SampleService sampleService) {
		this.sampleService = sampleService;
	}

	@GetMapping("/hello")
	public String hello() {

		log.debug("sseobs");
		log.debug("=====");
		
		return "hello " + sampleService.getName();
	}
}
