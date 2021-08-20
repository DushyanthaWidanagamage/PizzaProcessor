package com.pizza.kafkalistner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.pizza.model.Order;
import com.pizza.repository.*;;

@Service
public class KafkaListner {

	@Autowired
	private OrderRepository repository;
	
	@KafkaListener(topics="OrderQueue" , groupId = "group_id" , containerFactory = "kafkaListenerContainerFactory")
	public void consume(Order order) {
		
		repository.save(order);
		
	}
	
}
