package com.mkyong.helloworld.service;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class AlarmClock {

    private int hour;
    private int minute;

    public AlarmClock() {

    }

    public AlarmClock(int hourParam, int minutesParam) {
        this.hour = hourParam;
        this.minute = minutesParam;
        startAlarm(hour, minute);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    private void startAlarm(int hourParam, int minutesParam) {

        Thread thread = new Thread() {

            Calendar calendar = new GregorianCalendar();

            public void run() {
                int w1 = 0;
                while (w1 == 0) {
                    int currentHour = calendar.get(Calendar.HOUR);
                    int currentMinute = calendar.get(Calendar.MINUTE);
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Hour: " + currentHour + " Minute: " + currentMinute);
                    //TODO: FIX why current hour and currentMinute is not updating
                    if (currentHour == hourParam &&  currentMinute == minutesParam) {
                        System.out.println("SOUND THE ALARM");
                        w1 = 1;
                        return;
                        //TODO: Invoke the JSP via a bean to popup
                    }
                }
            }

        };
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();

    }

    public AlarmClock getAlarmTime() {
        return this;
    }

    public static void main(String[] args) {
        AlarmClock alarmClock = new AlarmClock(11, 56);

        // TODO: Make sure the alarm cannot be set in the past

    }
}
