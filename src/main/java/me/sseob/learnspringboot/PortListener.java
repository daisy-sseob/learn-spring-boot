package me.sseob.learnspringboot;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PortListener implements ApplicationListener<ServletWebServerInitializedEvent> {

	// random port 사용시 port가 무었인지 알아보기
	@Override
	public void onApplicationEvent(ServletWebServerInitializedEvent event) {
		ServletWebServerApplicationContext applicationContext = event.getApplicationContext();
		int port = applicationContext.getWebServer().getPort();

		System.out.println("###PortListener server port : "+ port);
		System.out.println("\n");
	}
}
