package com.example.springvalidation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.springvalidation.customvalidation.Person2Validator;
import com.example.springvalidation.entity.Person;
import com.example.springvalidation.entity.Person2;

@Controller
public class ExampleController {
	
	@Autowired
	Person2Validator person2Validator;

	@RequestMapping(value = "/1", method = RequestMethod.GET)
	public String person(Model model) {
		model.addAttribute("person", new Person());
		return "PersonForm";
	}

	@RequestMapping(value = "/2", method = RequestMethod.GET)
	public String person2(Model model) {
		model.addAttribute("person2", new Person2());
		return "PersonForm2";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute("person") @Valid Person person, BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return "PersonForm";
		return "RegisterSuccess";
	}

	@RequestMapping(value = "/register2", method = RequestMethod.POST)
	public String register(@ModelAttribute("person2") @Valid Person2 person2, BindingResult bindingResult) {
		person2Validator.validate(person2, bindingResult);
		if (bindingResult.hasErrors())
			return "PersonForm2";
		return "RegisterSuccess";
	}

}
