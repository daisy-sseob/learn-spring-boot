package me.sseob.learnspringboot.runner;

import me.sseob.learnspringboot.SeobProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 프로퍼티와 mapping한 Class확인.
 */
@Component
public class SimpleRunner implements ApplicationRunner {

	private final SeobProperties seobProperties;

	@Autowired
	public SimpleRunner(SeobProperties seobProperties) {
		this.seobProperties = seobProperties;
	}
	
	/*
	@value 어노테이션이 아닌 Properties를 매핑하는 Class를 만들어 bean으로 등록하여 type safe한 코드를 만들어보자. 
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
		System.out.println("sessionTimeout : " + seobProperties.getSessionTimeout());
		System.out.println("============SimpleRunner============");
		System.out.println("\n");
	}
}
