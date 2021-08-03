package net.xdclass.demoproject.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 视频控制器
 */


//@Controller
@RestController
@RequestMapping("/api/v1/video")
//@SpringBootApplication
public class VideoController {


//    public static void main(String[] args) {
//
//        SpringApplication.run(VideoController.class, args);
//    }



    @RequestMapping("list")
    //@GetMapping("list")
    //@PostMapping("list")
    //@ResponseBody
    public Object list(){

        Map<String,String > map = new HashMap<>();
        map.put("1","面试专题课程");
        map.put("2","SpringCloud微服务课程");

        return map;

    }



}
