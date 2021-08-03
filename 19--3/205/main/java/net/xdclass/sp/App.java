package net.xdclass.sp;

import net.xdclass.sp.domain.Video;
import net.xdclass.sp.domain.VideoOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String [] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Video  video = (Video)context.getBean("video");
        System.out.println(video.getTitle());


        VideoOrder videoOrder = (VideoOrder) context.getBean("videoOrder");
        System.out.println(videoOrder.getOutTradeNo());
        System.out.println(videoOrder.getVideo().getTitle());

    }

}
