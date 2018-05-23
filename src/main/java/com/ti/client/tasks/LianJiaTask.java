package com.ti.client.tasks;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LianJiaTask {
    @Scheduled(cron="* * * * * *")
    public void build(){
        log.info("start to build task.....");
    }
}
