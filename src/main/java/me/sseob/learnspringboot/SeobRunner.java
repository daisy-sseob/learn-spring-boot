package me.sseob.learnspringboot;

import me.sseob.Seob;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SeobRunner implements ApplicationRunner {

	private final Seob seob;

	public SeobRunner(Seob seob) {
		this.seob = seob;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(seob);
	}
}
