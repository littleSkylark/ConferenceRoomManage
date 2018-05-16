package com.lark.task;

import com.lark.service.FutureBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by skylark on 2017/2/18.
 */
@Component
public class FutureBookingUpdate {

    @Autowired
    private FutureBookingService futureBookingService;

    /**
     * 定时计算。每天凌晨 00:00 执行一次
     */
    @Scheduled(cron = "0 0 0 * * *")
    public void update(){
        //System.err.println("Annotation：is show run");
        futureBookingService.deleteInvalid();
    }

    /**
     * 心跳更新。启动时执行一次，之后每隔5秒执行一次
     */
    /*@Scheduled(fixedRate = 1000*10)
    public void print(){
        System.err.println("Annotation：print run");
        System.err.println(futureBookingService.deleteInvalid());
    }*/
}
