package cn.wxc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * Author:wxc
 * project: springcloud_02
 * ClassName: ReceiveMessageListenerController
 * Date: 2020/8/18 16:43 周二
 * yy:猥琐别浪，等我发育。
 */


//@Component
@Controller
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {
    @Value("${server.port}")
    private String serverPort;


    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("消费者8802号,----->接受到的消息: " + message.getPayload() + "\t  port: " + serverPort);
    }
}