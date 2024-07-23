package com.asm.sutraders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asm.sutraders.dto.EmailSenderDto;
import com.asm.sutraders.service.EmailSenderService;

@Controller
@RequestMapping("api/v1/email-send")
public class EmailSenderController {
	private EmailSenderService emailSenderService;

	public EmailSenderController(EmailSenderService emailSenderService) {
		this.emailSenderService = emailSenderService;
	}

	@GetMapping("/form")
	public String showEmailForm(Model model) {
		model.addAttribute("emailSenderDto", new EmailSenderDto());
		return "index";
	}

	@PostMapping("/send-email")
	public String createEmail(@ModelAttribute("emailSenderDto") EmailSenderDto emailSenderDto) {
		emailSenderService.createEmail(emailSenderDto);
		return "redirect:/api/v1/email-send/form"; // Redirect to the form page after submission
	}

}
