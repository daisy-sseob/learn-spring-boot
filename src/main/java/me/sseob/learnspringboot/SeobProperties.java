package me.sseob.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.time.Duration;

@Component
@ConfigurationProperties("sseob")
@Validated
public class SeobProperties {
	
	private String name;
	private int age;
	private String fullName;
	
// 이 값은 Seconds로 받는다는 명시적 표현. 
// (properties file에서 s라는 seconds를 상징하는 문자를 붙여주면 알아서 Duration Tyoe으로 Conversion해줌 생략 가능) 
//	@DurationUnit(ChronoUnit.SECONDS) 
	private Duration sessionTimeout = Duration.ofSeconds(30); // 기본값 30초

	public Duration getSessionTimeout() {
		return sessionTimeout;
	}

	public void setSessionTimeout(Duration sessionTimeout) {
		this.sessionTimeout = sessionTimeout;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
