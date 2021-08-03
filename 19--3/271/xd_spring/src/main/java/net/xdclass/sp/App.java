package net.xdclass.sp;

import net.xdclass.sp.domain.Video;
import net.xdclass.sp.domain.VideoOrder;
import net.xdclass.sp.service.VideoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {


    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //扫描指定的包，包括子包
        context.scan("net.xdclass");


        //里面完成初始化操作，核心方法
        context.refresh();

        VideoOrder videoOrder = (VideoOrder) context.getBean("videoOrderName");





//        VideoService videoService = (VideoService) context.getBean("videoService");
//
//        videoService.findById(2);


//        Video video1 = (Video) context.getBean("video");
//
//        Video video2 = (Video) context.getBean("video");
//
//        System.out.println(video1 == video2);

    }


}
