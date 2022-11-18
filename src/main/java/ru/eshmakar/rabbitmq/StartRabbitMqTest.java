package ru.eshmakar.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"ru.eshmakar.rabbitmq.example"})
public class StartRabbitMqTest {
    public static void main(String[] args) {
        SpringApplication.run(StartRabbitMqTest.class, args);
    }
}
