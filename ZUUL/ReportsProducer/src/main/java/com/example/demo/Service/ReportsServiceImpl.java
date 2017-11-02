package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ReportsRepo;
import com.example.demo.model.Report;
@Service
public class ReportsServiceImpl implements ReportsService {
	
	@Autowired
	private final ReportsRepo repo;
	
	public ReportsServiceImpl(ReportsRepo repo) {
		this.repo = repo;
	}



	@Override
	public List<Report> getReports() {
		// TODO Auto-generated method stub
		return repo.getReports();
	}
	
}
