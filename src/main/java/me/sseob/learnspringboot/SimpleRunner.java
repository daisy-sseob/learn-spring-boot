package me.sseob.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SimpleRunner implements ApplicationRunner {

	private final SeobProperties seobProperties;

	@Autowired
	public SimpleRunner(SeobProperties seobProperties) {
		this.seobProperties = seobProperties;
	}
	
	/*
	@value 어노테이션이 아닌 Properties를 매핑하는 Class를 만들어 bean으로 주입받아 사용헤보자. 
	@Value("${sseob.name}")
	private String name;

	@Value("${sseob.age}")
	private int age;
	 */
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("============SimpleRunner============");
		System.out.println("name: " + seobProperties.getName());
		System.out.println("full name: " + seobProperties.getFullName());
		System.out.println("age: " + seobProperties.getAge());
		System.out.println("============SimpleRunner============");
		System.out.println("\n");
	}
}
