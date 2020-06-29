package com.wjh.testdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class TestdemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void demo01() throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2020-06-27 08:31:19");
        System.out.println(date.getTime());
        long date1 = date.getTime();
        Date WorkDay = new SimpleDateFormat("yyyy-MM-dd").parse("2020-06-27" );
        System.out.println(WorkDay.getTime());
        Long firstComeBeginMil = WorkDay.getTime()+510*60000;
        System.out.println(firstComeBeginMil);
        Long lateMil = date1-firstComeBeginMil;
        int lateMin1 = (int) Math.floor((double)lateMil/60000);
        System.out.println(lateMin1);
    }

}
