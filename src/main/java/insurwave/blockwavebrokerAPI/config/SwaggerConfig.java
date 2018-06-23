package insurwave.blockwavebrokerAPI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Generates Swagger2 API documentation for BrokerAPI.
 * 
 * @author saisree
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurationSupport {
	/**
	 * Docket bean to configure Swagger2 documentation for BrokerAPI rest
	 * controllers.
	 * 
	 * @return
	 */
	@Bean
	public Docket blockWaveBrokerApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("insurwave.blockwavebrokerAPI.controller"))
				.paths(PathSelectors.any()).build().apiInfo(metaData());
	}

	/**
	 * Provides information on the BrokerAPI application in the Swagger2 generated
	 * documentation.
	 * 
	 * @return
	 */
	private ApiInfo metaData() {
		return new ApiInfoBuilder().title("BlockWave Broker API REST Services")
				.description("\"Spring Boot REST APIs for BlockWaveBrokerAPI\"").version("1.0.0")
				.license("EY License Version 1.0")
				.contact(new Contact("Saisree Sudhir", "http://www.ey.com", "saisree.sudhir@in.ey.com")).build();
	}

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
		super.addResourceHandlers(registry);
	}
}
