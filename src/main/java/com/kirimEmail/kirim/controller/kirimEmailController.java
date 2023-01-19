package com.kirimEmail.kirim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class kirimEmailController {

    @Autowired
    private JavaMailSender javaMailSender;
    
    @GetMapping(value = "/") // @RequestMapping using in the method level ,it has default GET method
	public ModelAndView dashboard() {
		ModelAndView model = null;
		model = new ModelAndView("admin_candidate");
		System.err.println("eror");
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("ricky.fardiansha@gmail.com","muhammad.dawud91@gmail.com");

        msg.setSubject("Testing from Spring Boot");
        msg.setText(" Silahkan Hadir  http://recruit.pungkookid.com/adminHome ");
        javaMailSender.send(msg);
		return model;
	}
}
