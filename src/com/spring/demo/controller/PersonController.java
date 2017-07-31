/**
 * 
 */
package com.spring.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.demo.service.IPersonService;

/**
 * @date 2017年7月31日 下午3:47:45
 * @author tiankun
 * 
 */
@Controller
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	IPersonService service;
	
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public String getAll(Model model){
		model.addAttribute("personList", service.getAll());
		return "list";
	}
	
}
