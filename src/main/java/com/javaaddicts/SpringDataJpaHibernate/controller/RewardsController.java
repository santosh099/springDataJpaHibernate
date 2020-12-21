package com.javaaddicts.SpringDataJpaHibernate.controller;

import java.util.List;
import java.util.Set;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.javaaddicts.SpringDataJpaHibernate.entity.Rewards;
import com.javaaddicts.SpringDataJpaHibernate.model.Response;
import com.javaaddicts.SpringDataJpaHibernate.service.RewardsService;

@RestController
@RequestMapping("/rewards")
@CrossOrigin("*")
public class RewardsController {
	
	@Autowired
	RewardsService rewardsService;

	@GetMapping
	public List<Response> getRewardsData() {
		return rewardsService.getRewardsData();
	}
	
	@GetMapping("/{month}")
	public List<Response> getRewardsDataByMonth(@PathVariable Integer month){
		List<Response> monthResponse = rewardsService.getRewardsDataByMonth(month);
		return monthResponse;
	}
}
