package net.xdclass.sp;

import net.xdclass.sp.domain.Video;
import net.xdclass.sp.domain.VideoOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String [] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //testScope(context);
        testInject(context);

    }

    //注入测试
    private static  void testInject(ApplicationContext context){

        Video  video = (Video)context.getBean("video");
        System.out.println(video.getTitle());

        VideoOrder  videoOrder = (VideoOrder)context.getBean("videoOrder");

        System.out.println(videoOrder.getVideo().getTitle());
    }



    //作用域测试
    private static  void testScope(ApplicationContext context){
        Video  video1 = (Video)context.getBean("video");

        Video  video2 = (Video)context.getBean("video");

        //靠匹配内存地址，== 是匹配内存地址
        System.out.println( video1 == video2 );

    }


}
