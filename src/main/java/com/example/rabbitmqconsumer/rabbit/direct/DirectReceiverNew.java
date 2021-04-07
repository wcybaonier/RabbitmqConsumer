//package com.example.rabbitmqconsumer.rabbit.direct;
//
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//import java.util.Map;
//
//@Component
//@RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
//public class DirectReceiverNew {
//
//    /**
//     * 那么直连交换机既然是一对一，那如果咱们配置多台监听绑定到同一个直连交互的同一个队列，会怎么样？
//     * 可以看到是实现了轮询的方式对消息进行消费，而且不存在重复消费。
//     */
//    @RabbitHandler
//    public void process(Map testMessage) {
//        System.out.println("DirectReceiver消费者收到消息--1  : " + testMessage.toString());
//    }
//
//}