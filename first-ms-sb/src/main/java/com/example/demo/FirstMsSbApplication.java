package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstMsSbApplication {

	public FirstMsSbApplication() {
		System.out.println("FirstMsSbApplication INSTANCE created....");
	}
	public static void main(String[] args) {
		System.out.println("FirstMsSbApplication main() called..");
		SpringApplication.run(FirstMsSbApplication.class, args);
	}

}
