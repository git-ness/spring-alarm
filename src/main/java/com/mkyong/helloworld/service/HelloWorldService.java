package com.mkyong.helloworld.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class HelloWorldService {

	private static final Logger logger = LoggerFactory.getLogger(HelloWorldService.class);

	public String getDesc() {

		logger.debug("getDesc() is executed!");

		return "Alarm Clock for Funsies";

	}

    @PostMapping("/")
    public String greetingSubmit(AlarmClock alarmClock) {
        return "";
    }


    public String getTitle(String name) {

		logger.debug("getTitle() is executed! $name : {}", name);

		if(StringUtils.isEmpty(name)){
			return "";
		}else{
			return "";
		}
		
	}

}