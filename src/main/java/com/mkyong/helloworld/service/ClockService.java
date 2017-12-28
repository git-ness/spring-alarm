package com.mkyong.helloworld.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;


public class ClockService implements java.io.Serializable {

    private LocalDateTime now;


}
