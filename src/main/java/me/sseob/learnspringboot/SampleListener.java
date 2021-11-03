package me.sseob.learnspringboot;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class SampleListener implements ApplicationListener<ApplicationStartingEvent> {
	
	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		System.out.println("############SampleListener############");
		System.out.println("Application is stating !");
		System.out.println("############SampleListener############");
		System.out.println("\n");
	}
}
