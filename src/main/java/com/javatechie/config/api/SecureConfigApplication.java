package com.javatechie.config.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ConfigProps.class)
public class SecureConfigApplication implements CommandLineRunner {

	private final ConfigProps props;

	public SecureConfigApplication(ConfigProps props) {
		this.props = props;
	}

	public static void main(String[] args) {
		SpringApplication.run(SecureConfigApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Logger logger = LoggerFactory.getLogger(SecureConfigApplication.class);

		logger.info("----------------------------------------");
		logger.info("Configuration properties");
		logger.info("   example.username is {}", props.getUsername());
		logger.info("   example.password is {}", props.getPassword());
		logger.info("----------------------------------------");
	}
}
