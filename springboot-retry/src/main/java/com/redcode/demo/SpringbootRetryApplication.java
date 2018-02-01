package com.redcode.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry  //开启Retry服务
@SpringBootApplication
public class SpringbootRetryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRetryApplication.class, args);
	}
}
