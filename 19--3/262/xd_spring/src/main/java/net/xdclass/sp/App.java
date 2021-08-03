package net.xdclass.sp;

import net.xdclass.sp.domain.Video;
import net.xdclass.sp.service.VideoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {


    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //扫描指定的包，包括子包
        context.scan("net.xdclass");


        //里面完成初始化操作，核心方法
        context.refresh();


        VideoService videoService = (VideoService) context.getBean("videoService");

        videoService.findById(2);


        Video video = (Video) context.getBean("video");
        video.init();
    }


}
