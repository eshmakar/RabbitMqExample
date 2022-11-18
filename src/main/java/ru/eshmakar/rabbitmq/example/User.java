package ru.eshmakar.rabbitmq.example;

import lombok.SneakyThrows;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

    @SneakyThrows
    @RabbitListener(queues = RabbitConfig.MY_QUEUE)
    public void getFromQueue(String fromQueue){
        Thread.sleep(3000);
        System.out.println("user get element: " + fromQueue);
    }
}
