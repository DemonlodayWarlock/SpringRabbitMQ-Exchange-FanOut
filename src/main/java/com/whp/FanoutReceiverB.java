package com.whp;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
//@RabbitListener(queues = "fanout.B")
@RabbitListener(queues = "#{BMessage.name}")
public class FanoutReceiverB {
	@RabbitHandler
	public void process(String message) {
		System.out.println("fanout Receiver B: " + message);
	}
}
