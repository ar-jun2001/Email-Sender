package com.asm.sutraders.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.asm.sutraders.dto.EmailSenderDto;

@Service
public class EmailSenderService {
	private JavaMailSender javaMailSender;
	private SimpleMailMessage mailMessage;

	public EmailSenderService(JavaMailSender javaMailSender, SimpleMailMessage mailMessage) {

		this.javaMailSender = javaMailSender;
		this.mailMessage = mailMessage;
	}

	public void createEmail(EmailSenderDto emailSenderDto) {
		mailMessage.setSubject(emailSenderDto.getSubject());
		mailMessage.setFrom(emailSenderDto.getFromName());
		mailMessage.setText(emailSenderDto.getMessageText());

		for (String bcc : emailSenderDto.getBccEmailId()) {
			mailMessage.setBcc(bcc);
		}
		for (String to : emailSenderDto.getToName()) {
			mailMessage.setTo(to);
		}
		for (String cc : emailSenderDto.getToName()) {
			mailMessage.setCc(cc);
		}
		javaMailSender.send(mailMessage);
	}

}
