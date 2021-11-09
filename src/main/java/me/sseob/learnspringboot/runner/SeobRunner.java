package me.sseob.learnspringboot.runner;

import me.sseob.Seob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * sseob-spring-boot-starter 의존성을 통해 bean이 생성되었는지 확인 확인용
 */
@Component
public class SeobRunner implements ApplicationRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	private final Seob seob;

	public SeobRunner(Seob seob) {
		this.seob = seob;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.debug("SeobRunner: {}\n",seob);
	}
}
