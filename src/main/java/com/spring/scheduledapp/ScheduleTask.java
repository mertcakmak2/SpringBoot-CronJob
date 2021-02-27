package com.spring.scheduledapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@Configuration
@EnableScheduling
public class ScheduleTask {

    //Program ayağa kalktıktan 30 saniye sonra çıktıyı verir.
    @Scheduled(cron="*/30 * * * * *", zone="Europe/Istanbul")
    public void task1() {
        System.out.println("30 saniyede bir"+ new Date());
    }

    //Programla birlikte direk çıktıyı verir
    @Scheduled(fixedRate = 45000L)
    public void task2() {
        System.out.println("45 saniyede bir "+ new Date());
    }

    //Program ayağa kalktıktan 1 dakika sonra çıktıyı verir.
    @Scheduled(cron = "0 0/1 * * * *")
    public void task3() {
        System.out.println("1 dakikada bir "+ new Date());
    }
}
