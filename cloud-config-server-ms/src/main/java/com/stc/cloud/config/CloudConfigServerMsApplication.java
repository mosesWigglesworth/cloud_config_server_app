package com.stc.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wigglesworth.m
 */
@SpringBootApplication
@EnableConfigServer
@Slf4j
public class CloudConfigServerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerMsApplication.class, args);
	}

}
