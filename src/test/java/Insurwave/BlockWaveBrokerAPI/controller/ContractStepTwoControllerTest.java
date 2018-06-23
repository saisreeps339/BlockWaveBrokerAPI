package Insurwave.BlockWaveBrokerAPI.controller;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.databind.ObjectMapper;

import insurwave.blockwavebrokerAPI.jsondto.ContractStepTwo;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
// @WebMvcTest(value = ContractStepTwoController.class, secure = false)
public class ContractStepTwoControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void saveSection2ContractDetails() throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		// JSON from file to Object
		try {
			ContractStepTwo[] cs = mapper.readValue(new File("C:\\BWPOC\\storedproc\\SpJSONstep2.txt"),
					ContractStepTwo[].class);
			String request = mapper.writeValueAsString(cs);
			ResponseEntity<String> responseEntity = this.testRestTemplate
					.postForEntity("http://localhost:8080/api/Contract/Section2ContractDetails", request, String.class);
			System.out.println(responseEntity);
			// contractStepTwoController.saveSection2ContractDetails(cs);

			/*
			 * // Send course as body to /students/Student1/courses RequestBuilder
			 * requestBuilder = MockMvcRequestBuilders
			 * .post("/api/Contract/Section2ContractDetails")
			 * .accept(MediaType.APPLICATION_JSON).content(mapper.writeValueAsBytes(cs))
			 * .contentType(MediaType.APPLICATION_JSON);
			 * 
			 * MvcResult result = mockMvc.perform(requestBuilder).andReturn();
			 * 
			 * MockHttpServletResponse response = result.getResponse();
			 * 
			 * assertEquals(HttpStatus.OK.value(), response.getStatus());
			 * 
			 * assertEquals("http://localhost/students/Student1/courses/1",
			 * response.getHeader(HttpHeaders.LOCATION));
			 */
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
