package me.sseob.learnspringboot.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.system.OutputCaptureRule;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class)
public class SampleControllerSliceTest {

	@Rule
	public OutputCaptureRule outputCapture = new OutputCaptureRule();

	@MockBean
	SampleService mockSampleService;

	@Autowired
	MockMvc mockMvc;

	@Test
	public void hello() throws Exception {
		when(mockSampleService.getName()).thenReturn("sseob test");

		mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
				.andExpect(status().isOk())
				.andExpect(content().string("hello sseob test"));

		assertThat(outputCapture.toString())
				.contains("sseobs")
				.contains("=====")
		;
	}
}