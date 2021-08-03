package net.xdclass.sp;

import net.xdclass.sp.aop.AnnotationAppConfig;
import net.xdclass.sp.domain.Video;
import net.xdclass.sp.domain.VideoOrder;
import net.xdclass.sp.service.VideoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationAppConfig.class);

        VideoService videoService = (VideoService) context.getBean("videoService");

        videoService.findById(2);

    }


}
