package com.pizza.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pizza.model.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

}
