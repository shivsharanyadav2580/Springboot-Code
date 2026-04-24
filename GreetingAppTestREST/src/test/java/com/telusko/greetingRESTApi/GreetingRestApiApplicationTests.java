package com.telusko.greetingRESTApi;


import com.telusko.greetingRESTApi.model.Student;
import com.telusko.greetingRESTApi.service.Igreeting;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import tools.jackson.databind.ObjectMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
class GreetingRestApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockitoBean
	private Igreeting service;

	@Test

	public void testgetGreeting() throws Exception {
// mockObject
		Mockito.when(service.generateGreeting("Shiv"))
				.thenReturn("Good morning shiv");
// RequestObjetc
		MvcResult result = mockMvc.perform(
						MockMvcRequestBuilders.get("/greet")
								.param("name", "Shiv"))
				.andReturn();

		int status = result.getResponse().getStatus();
		String body = result.getResponse().getContentAsString();

		assertEquals(200, status);
		assertEquals("Good morning shiv", body);
	}

	@Test
	public void testAddstudentInfo() throws Exception {

		// Mocking
		Mockito.when(service.addAlienInfo(ArgumentMatchers.any())).thenReturn(true);

		Student student = new Student(1 , "Rohan " , "bengluru");
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(student);
		// RequestObject
		MockHttpServletRequestBuilder requstbuilder = MockMvcRequestBuilders.post("/student-data").
				contentType(MediaType.APPLICATION_JSON).content(json);

		ResultActions res = mockMvc.perform(requstbuilder);

		MvcResult result = res.andReturn();
		MockHttpServletResponse response = result.getResponse();

		int status = response.getStatus();

		assertEquals(201 , status);









	}
}