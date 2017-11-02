package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ReportsService;
import com.example.demo.model.Report;


@RestController
public class ReportsController {
	@Autowired
	private final ReportsService service;
	
	
	public ReportsController(ReportsService service) {
			this.service = service;
	}


	@RequestMapping(method=RequestMethod.GET, value="/reports")
	public List<Report> getReports(){
		return service.getReports();
	}
	
	

}
