package com.nit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.entity.Tourist;
import com.nit.service.ITouristMgmtService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/Tourist-api")
@Tag(name = "Tourist" ,description = "Tourist API")
public class TouristOperationRestController {
	@Autowired
	ITouristMgmtService service;
	@GetMapping("/show")
	public ResponseEntity<List<Tourist>> getAllTourist()
	{
		List<Tourist> list=service.getAllTourist();
		return new ResponseEntity<List<Tourist>>(list, HttpStatus.OK);
	}
	@PostMapping("/register")
	public ResponseEntity<String> registerTourist(@RequestBody Tourist tourist)
	{
		String msg = service.addTourist(tourist);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	@PutMapping("/update/{tId}")
	public ResponseEntity<String> updateTourist(@PathVariable("tId") Integer no,@RequestBody Tourist utourist)
	{
		String msg = service.updateTourist(no,utourist);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	@DeleteMapping("/delete/{tId}")
	public ResponseEntity<String> deleteTourist(@PathVariable("tId") Integer no)
	{
		String msg = service.deleteByID(no);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
