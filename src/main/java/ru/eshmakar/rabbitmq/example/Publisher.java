package ru.eshmakar.rabbitmq.example;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class Publisher {

    @Autowired
    private RabbitTemplate rabbitTemplate; //на красные подчеркивания не надо обращать внимания, это глюк новый версии idea

    @RequestMapping("/")
    public String addOrder(){
        String randomUUID = UUID.randomUUID().toString();
        rabbitTemplate.convertAndSend(RabbitConfig.MY_EXCHANGE, RabbitConfig.MY_ROUTING_KEY, randomUUID);
        return randomUUID;
    }
}
