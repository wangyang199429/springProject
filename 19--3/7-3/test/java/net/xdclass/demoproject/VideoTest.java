package net.xdclass.demoproject;


import junit.framework.TestCase;
import net.xdclass.demoproject.domain.Video;
import net.xdclass.demoproject.service.VideoService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)  //底层用junit  SpringJUnit4ClassRunner
@SpringBootTest(classes={DemoProjectApplication.class})//启动整个springboot工程
public class VideoTest {


    @Autowired
    private VideoService videoService;


    @Before
    public void testOne(){

        System.out.println("这个是测试 before");
    }



    @Test
    public void testVideoList(){

        List<Video> videoList = videoService.listVideo();

        TestCase.assertTrue(videoList.size()>0);

    }




//    @Test
//    public void testTwo1(){
//
//        System.out.println("这个是测试 test1");
//
//        TestCase.assertEquals(1,3);
//
//    }
//
//
//
//    @Test
//    public void testTwo2(){
//
//        System.out.println("这个是测试 test2");
//    }


    @After
    public void testThree(){

        System.out.println("这个是测试 after");
    }





}
