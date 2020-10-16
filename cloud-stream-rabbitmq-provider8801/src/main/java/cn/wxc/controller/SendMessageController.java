package cn.wxc.controller;

import cn.wxc.service.IMessageProvider;
import cn.wxc.service.Cs;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMessageController {

   @Resource
   private IMessageProvider messageProvider;

   @Resource
   private Cs cs;

   @RequestMapping("/sendMessage")
   public String sendMessage(){
      return messageProvider.send();
   }

   @RequestMapping("/cs")
   public String cs(){
      cs.cs();
      return "这里是测试sleuth";

   }
}