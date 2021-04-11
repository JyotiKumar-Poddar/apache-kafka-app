package com.kafkfa.app.consumer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Consumer {

	@KafkaListener(topics = "time-series",groupId = "group_id")
	public void consumeMessage(String message){
		log.info("Consumed message is  :- {}", message);
	}
}
