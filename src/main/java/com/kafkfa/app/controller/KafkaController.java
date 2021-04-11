package com.kafkfa.app.controller;


import com.kafkfa.app.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class KafkaController {

	private final Producer producer;

	@Autowired
	public KafkaController(Producer producer) {
		this.producer = producer;
	}


	@GetMapping("/time-is")
	public String timeIs() {
		LocalDateTime now = LocalDateTime.now();
		producer.produceMessage("The current time is " + now);
		return now.toString();
	}
}
