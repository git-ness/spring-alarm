package com.mkyong.helloworld.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;


public class Clock {

    private final Calendar hour;
    private final Calendar calendar;
    private final Calendar minutes;

    public Clock(Calendar hour, Calendar minutes) {
        this.calendar = new GregorianCalendar();
        this.hour = hour;
        this.minutes = minutes;
    }


}
