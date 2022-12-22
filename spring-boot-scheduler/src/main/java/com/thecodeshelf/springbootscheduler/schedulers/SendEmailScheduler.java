package com.thecodeshelf.springbootscheduler.schedulers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class SendEmailScheduler {

    @Scheduled(cron = "0 * * * * *")
    public void sendEmailEveryMinuteScheduler() {
        System.out.println("Sending Email At : " + LocalDateTime.now());
    }


}
