package com.jenkin.project;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
public class Sample{

	@GetMapping("/home")
	public ResponseEntity<Void> getHomes() {
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}

