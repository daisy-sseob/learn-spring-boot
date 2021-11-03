package me.sseob.learnspringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SimpleRunner implements ApplicationRunner {
	
	@Value("${sseob.name}")
	private String name;
	
	@Value("${sseob.age}")
	private int age;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("============SimpleRunner============");
		System.out.println("name: " + name + ", age: " + age);
		System.out.println("============SimpleRunner============");
		System.out.println("\n");
	}
}
