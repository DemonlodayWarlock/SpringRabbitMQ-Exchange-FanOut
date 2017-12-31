package com.whp;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
//@RabbitListener(queues = "fanout.A")
@RabbitListener(queues = "#{AMessage.name}")
public class FanoutReceiverA {
	@RabbitHandler
	public void process(String message) {
		System.out.println("fanout Receiver A : " + message);
	}

}
