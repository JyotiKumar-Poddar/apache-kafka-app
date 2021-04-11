package com.kafkfa.app.producer;


import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Producer {
	private static final String TOPIC = "time-series";

	private final KafkaTemplate<String, String> kafkaTemplate;


	public void produceMessage(String message) {
		kafkaTemplate.send(TOPIC, message);
	}
}
