package com.whp;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FanoutRabbitConfig {

	// 创建队列
	@Bean
	public Queue AMessage() {
		return new Queue("fanout.A");
	}

	// 创建队列
	@Bean
	public Queue BMessage() {
		return new Queue("fanout.B");
	}

	// 创建队列
	@Bean
	public Queue CMessage() {
		return new Queue("fanout.C");
	}

	// 创建Fanout交换器
	@Bean
	FanoutExchange fanoutExchange() {
		return new FanoutExchange("fanoutExchange");
	}

	// 将对列绑定到Fanout交换器
	@Bean
	Binding bindingExchangeA(Queue AMessage, FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(AMessage).to(fanoutExchange);
	}

	// 将对列绑定到Fanout交换器
	@Bean
	Binding bindingExchangeB(Queue BMessage, FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(BMessage).to(fanoutExchange);
	}

	// 将对列绑定到Fanout交换器
	@Bean
	Binding bindingExchangeC(Queue CMessage, FanoutExchange fanoutExchange) {
		return BindingBuilder.bind(CMessage).to(fanoutExchange);
	}
}