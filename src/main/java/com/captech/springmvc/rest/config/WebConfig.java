package com.captech.springmvc.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Validator;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static com.fasterxml.jackson.databind.SerializationFeature.WRITE_ENUMS_USING_TO_STRING;

/**
 * <p>
 * Spring WebConfig class.
 * </p>
 *
 * @author Macon Pegram
 * @since 1.0.0
 */
@Configuration
@EnableWebMvc
@ComponentScan({ "com.captech.springmvc.rest.interfaces", "com.captech.springmvc.rest.service" })
public class WebConfig implements WebMvcConfigurer {

	/**
	 * {@inheritDoc}
	 * <p>
	 * <p>
	 * Configures:
	 * </p>
	 * <ul>
	 * <li>MappingJackson2HttpMessageConverter</li>
	 * </ul>
	 */
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		final MappingJackson2HttpMessageConverter jackson2 = new MappingJackson2HttpMessageConverter();

		jackson2.getObjectMapper().enable(WRITE_ENUMS_USING_TO_STRING)
				.setSerializationInclusion(NON_NULL);

		converters.add(jackson2);
	}

	/**
	 * <p>
	 * methodValidationPostProcessor supports method level validation annotations.
	 * </p>
	 *
	 * @param validator
	 *            Field Validator
	 * @return a MethodValidationPostProcessor
	 */
	@Bean
	public MethodValidationPostProcessor methodValidationPostProcessor(final Validator validator) {
		final MethodValidationPostProcessor methodValidationPostProcessor = new MethodValidationPostProcessor();
		methodValidationPostProcessor.setValidator(validator);
		return methodValidationPostProcessor;
	}

	/**
	 * Configures a Validator that can be injected into our Resources.
	 *
	 * @return A Validator.
	 */
	@Bean
	public javax.validation.Validator localValidatorFactoryBean() {
		return new LocalValidatorFactoryBean();
	}
}
