package com.example.springkadaiform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springkadaiform.form.ContactForm;

import jakarta.validation.Valid;

@Controller
public class ContactFormController {
	//入力画面表示
	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("contactForm" , new ContactForm());
		return "contactFormView";
	}
	
	
	@PostMapping("/confirm")
	public String submitForm(
			@Valid @ModelAttribute ContactForm contactForm,
			BindingResult bindingresult,
			Model model) {
		
		//バリデーションエラー
		if (bindingresult.hasErrors())
			return "contactFormView";
		
		return "confirmView";
	}

}
