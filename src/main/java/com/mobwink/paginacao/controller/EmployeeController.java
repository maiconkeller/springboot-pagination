package com.mobwink.paginacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mobwink.paginacao.repository.EmployeeRepository;

@Controller
@RequestMapping("employees")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping
	public ModelAndView employeesPageable(Pageable pageable){
		ModelAndView mv = new ModelAndView("employees/list");
		mv.addObject("employeesPage", employeeRepository.findAll(pageable));
		return mv;
	}
}
