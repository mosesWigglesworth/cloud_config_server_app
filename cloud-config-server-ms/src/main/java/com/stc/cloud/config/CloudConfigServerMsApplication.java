package com.stc.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author wigglesworth.m
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerMsApplication.class, args);
	}

}
