package com.spring4all.digitalsign.service.api.config;

import com.spring4all.digitalsign.service.api.aware.RabbitListenerAware;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author liumapp
 * @file RabbitConfig.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 7/20/18
 */
@Component
public class RabbitConfig {

    @Value("${spring.rabbitmq.custom.exchange}")
    private String queueExchange;

    @Value("${spring.rabbitmq.custom.routingkey}")
    private String routingKey;

    @Bean
    public Queue synchQueue () {
        return new Queue("synch-queue", true);
    }

    @Bean
    public MessageConverter messageConverter () {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public RabbitTemplate template (ConnectionFactory connectionFactory, MessageConverter messageConverter) {
        RabbitTemplate template = new RabbitTemplate(connectionFactory);
        template.setMandatory(true);
        template.setExchange(queueExchange);
        template.setRoutingKey(routingKey);
        template.setMessageConverter(messageConverter);
        return template;
    }

    @Bean
    public MessageListenerAdapter messageListenerAdapter(RabbitListenerAware listenerAware, MessageConverter converter) {
        return new MessageListenerAdapter(listenerAware, converter);
    }

    @Bean
    public SimpleMessageListenerContainer container (ConnectionFactory connectionFactory, MessageListenerAdapter messageListenerAdapter, Queue... queues) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory);
        container.setQueues(queues);
        container.setExposeListenerChannel(true);
        container.setMaxConcurrentConsumers(10);
        container.setConcurrentConsumers(5);
        container.setPrefetchCount(1000);
        container.setAcknowledgeMode(AcknowledgeMode.MANUAL);
        container.setMessageListener(messageListenerAdapter);
        return container;
    }

    @Bean
    public TopicExchange exchange () {
        return new TopicExchange(queueExchange);
    }

    @Bean
    public Binding binding (Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(routingKey);
    }

}
