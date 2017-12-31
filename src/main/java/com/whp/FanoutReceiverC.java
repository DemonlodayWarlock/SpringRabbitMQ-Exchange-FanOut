package com.whp;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
//@RabbitListener(queues = "fanout.C")
@RabbitListener(queues = "#{CMessage.name}")
public class FanoutReceiverC {
	@RabbitHandler
	public void process(String message) {
		System.out.println("fanout Receiver C: " + message);
	}

}
