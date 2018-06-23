package insurwave.blockwavebrokerAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import insurwave.blockwavebrokerAPI.util.SplunkUtil;

@SpringBootApplication
public class BlockWaveBrokerApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SplunkUtil.reportHttpEventCollectorError();
		SpringApplication.run(BlockWaveBrokerApiApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BlockWaveBrokerApiApplication.class);
	}
}