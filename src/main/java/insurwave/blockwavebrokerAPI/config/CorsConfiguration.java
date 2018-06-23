package insurwave.blockwavebrokerAPI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration {
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				// registry.addMapping("/api/**")
				registry.addMapping("/**")
						.allowedOrigins("http://localhost:7000", "http://localhost:8080", "http://localhost:4000")
						.allowedMethods("*").allowedHeaders("*").allowCredentials(false).maxAge(3600);
			}
		};
	}

}
