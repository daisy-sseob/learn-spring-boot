package me.sseob.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Program Argument를 ApplicationArguments Bean을 통해 받아보자
 * ApplicationRunner의 추상메소드를 구현하여 ApplicationArguments를 받을 수도 있다.
 */
@Component
public class PrintArgument implements ApplicationRunner {
	
	@Autowired
	public PrintArgument(ApplicationArguments arguments) {
		System.out.println("foo: " + arguments.containsOption("foo"));
		System.out.println("bar: " + arguments.containsOption("bar"));
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("foo: " + args.containsOption("foo"));
		System.out.println("bar: " + args.containsOption("bar"));
	}
}
