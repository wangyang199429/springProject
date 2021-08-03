package net.xdclass.sp;

import net.xdclass.sp.domain.Video;
import net.xdclass.sp.domain.Video2;
import net.xdclass.sp.domain.VideoOrder;
import net.xdclass.sp.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


    public static void main(String [] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        //testInitDestroy(context);
        //testScope(context);
        //testInject(context);
        //testInjectCollection(context);
        //testExtend(context);
        testAop(context);
        //((ClassPathXmlApplicationContext) context).registerShutdownHook();

    }


    private static  void testAop(ApplicationContext context){

        VideoService  videoService = (VideoService)context.getBean("videoService");
        videoService.save(new Video());
        videoService.findById(33);

    }



    private static  void testInitDestroy(ApplicationContext context){
        Video  video = (Video)context.getBean("video");

        System.out.println(video.getTitle());
    }







    private static  void testExtend(ApplicationContext context){
        Video2  video2 = (Video2)context.getBean("video2");

        System.out.println(video2.getSummary());
        System.out.println(video2.getTitle());
        System.out.println(video2.getId());
    }










    //注入测试
    private static  void testInjectCollection(ApplicationContext context){

        Video  video = (Video)context.getBean("video");
       // System.out.println(video.getChapterList().toString());
       // System.out.println(video.getVideoMap().values().toString());

    }




    //注入测试
    private static  void testInject(ApplicationContext context){

//        Video  video = (Video)context.getBean("video");
//        System.out.println(video.getTitle());

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
