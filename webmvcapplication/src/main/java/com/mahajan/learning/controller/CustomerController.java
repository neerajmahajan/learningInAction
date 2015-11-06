package com.mahajan.learning.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mahajan.learning.vo.CustomerVO;

@Controller
public class CustomerController {

	private static final Logger logger = LoggerFactory
			.getLogger(CustomerController.class);

	@RequestMapping(value = {"/","/login"})
	public ModelAndView displayLogin(HttpServletResponse response)
			throws IOException {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "displaySignup")
	public ModelAndView displaySignup(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		return new ModelAndView("signup");
	}

	@RequestMapping(value = "doSignup")
	public ModelAndView doSignup(HttpServletRequest request,
			HttpServletResponse response, CustomerVO customer)
			throws IOException {
		// TODO
		// save in data base;
		return new ModelAndView("login", "customer", customer);
	}

	@RequestMapping(value = "doLogin")
	public ModelAndView doLogin(HttpServletRequest request,
			HttpServletResponse response, @Valid CustomerVO customer,
			BindingResult errors) throws IOException {

		System.out.println(customer.getEmail());

		if (errors.hasErrors()) {
			System.out.println(errors.getAllErrors());
			logger.error(errors.getAllErrors().toString());
			return new ModelAndView("login");
		}

		return new ModelAndView("success");
	}
}
