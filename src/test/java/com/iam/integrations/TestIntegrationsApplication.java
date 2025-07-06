package com.iam.integrations;

import org.springframework.boot.SpringApplication;

public class TestIntegrationsApplication {

	public static void main(String[] args) {
		SpringApplication.from(IntegrationsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
