package com.capgemini.mc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MessageReceiver {

    @RequestMapping(value = "/message-receiver", method = RequestMethod.POST)
    public String receiveMarketingCloudMessage(@RequestBody String message) {
        return "return" + message;
    }
}
