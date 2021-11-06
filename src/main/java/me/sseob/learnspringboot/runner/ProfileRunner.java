package me.sseob.learnspringboot.runner;

import me.sseob.Seob;
import me.sseob.learnspringboot.SeobProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 프로파일 설정에 따라 어떻게 동작하는지 확인
 */
@Component
public class ProfileRunner implements ApplicationRunner {

	@Autowired
	private SeobProperties seobProperties;

	// profile config를 통해 생성한 bean 주입받음
	@Autowired
	private String hello;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("============ProfileRunner============");
		System.out.println(hello);
		System.out.println(seobProperties.getFullName());
		System.out.println("============ProfileRunner============");
	}
}
