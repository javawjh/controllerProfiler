package com.test.controller;

import com.github.xjs.ezprofiler.annotation.Profiler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @ClassName HelloController
 * Description TODO
 * Author yejianyi
 * @Date 2019-11-26 0026 11:12
 * Version 1.0
 **/
@RestController
@Profiler
public class HelloController {

    @GetMapping("/helloworld")
    public String hello1() {
        Random rnd = new Random();
        try{Thread.sleep(rnd.nextInt(3000));}catch(Exception e) {}
        return "helloworld";
    }
}
