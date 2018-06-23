import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import insurwave.blockwavebrokerAPI.controller.ContractStepTwoController;
import insurwave.blockwavebrokerAPI.jsondto.ContractStepTwo;

public class Test {

	public static void main(String[] args) {
		// String dateString = "2018-05-08T12:16:12.307Z";
		/*
		 * String dateString = "05/10/2019 00:00"; try {
		 * DateTimeUtil.createTimestamp(dateString); } catch (Exception e) { // this
		 * generic but you can control another types of exception // look the origin of
		 * excption e.printStackTrace(); }
		 */
		testControllerStep2();

	}

	public static void testControllerStep2() {
		ObjectMapper mapper = new ObjectMapper();

		// JSON from file to Object
		try {
			ContractStepTwo[] cs = mapper.readValue(new File("C:\\BWPOC\\storedproc\\SpJSONstep2.txt"),
					ContractStepTwo[].class);
			ContractStepTwoController cr = new ContractStepTwoController();
			cr.saveSection2ContractDetails(cs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
