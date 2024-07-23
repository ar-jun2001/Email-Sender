package com.asm.sutraders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;

@SpringBootApplication
public class EmailSenderProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailSenderProjectApplication.class, args);

	}

	@Bean
	public SimpleMailMessage simpleMailMessage() {
		return new SimpleMailMessage();
	}

}
