package com.project.exoplanet.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class modelConfig {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
