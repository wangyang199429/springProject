package net.xdclass.online_class;

import net.xdclass.online_class.dao.VideoMapper;
import net.xdclass.online_class.dao.VideoOrderMapper;
import net.xdclass.online_class.domain.User;
import net.xdclass.online_class.domain.Video;
import net.xdclass.online_class.domain.VideoOrder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.*;

public class SqlSessionDemo {


    public static void main(String [] args) throws IOException {

        String resouce = "config/mybatis-config.xml";

        //读取配置文件
        InputStream inputStream =  Resources.getResourceAsStream(resouce);



        //构建Session工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取Session
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){

//            VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);
//
//            for(int i=0; i<2; i++){
//                Video video = videoMapper.selectById(44);
//
//                System.out.println(video.toString());
//            }



            //通过注解
            // List<Video> videoList =  videoMapper.selectList();


            //List<Video> videoList = videoMapper.selectListByXML();

            //System.out.println(videoList.toString());


            //多参数查询
//            List<Video> videoList2 = videoMapper.selectByPointAndTitleLike(8.7,"HTML");
//            System.out.println(videoList2.toString());



//            //新增一条记录
//            Video video1 =  new Video();
//            video1.setTitle("小滴课堂面试专题900道11132323231");
//            video1.setCoverImg("xdclass.net/aaa.png111");
//            video1.setPoint(9.41);
//            video1.setCreateTime(new Date());
//            video1.setPrice(9911);
//            video1.setSummary("这个是面试专题概要11");
//            videoMapper.add(video1);

//
//            //新增一条记录
//            Video video2 =  new Video();
//            video2.setTitle("小滴课堂面试专题900道2");
//            video2.setCoverImg("xdclass.net/aaa.png2");
//            video2.setPoint(9.2);
//            video2.setCreateTime(new Date());
//            video2.setPrice(9922);
//            video2.setSummary("这个是面试专题概要22");
//
//
//            List<Video> list = new ArrayList<>();
//            list.add(video1);
//            list.add(video2);
//
//           int rows =  videoMapper.addBatch(list);
//            System.out.println(rows);
//            System.out.println(list.toString());


//            Video video =  new Video();
//            video.setId(57);
//            video.setTitle("小滴课堂面试专题900道 2021年新版");
//            video.setCoverImg("xdclass.net/6666.png");
//
//            videoMapper.updateVideoSelective(video);
//
//            Map<String,Object> map = new HashMap<>();
//            map.put("createTime","2021-01-11 09:33:20");
//
//            map.put("price",9000);
//
//            int rows = videoMapper.deleteByCreateTimeAndPrice(map);
//
//            System.out.println(rows);

//
//            Video video = videoMapper.selectBaseFieldByIdWithResultMap(45);
//            System.out.println(video.toString());




            // resultmap association关联查询
//            VideoOrderMapper videoOrderMapper = sqlSession.getMapper(VideoOrderMapper.class);
//            List<VideoOrder> videoOrderList = videoOrderMapper.queryVideoOrderList();
//
//            System.out.println(videoOrderList.toString());



            //resultmap collection测试

  //          List<User> userList = videoOrderMapper.queryUserOrder();

  //          System.out.println(userList.toString());



            // resultmap association关联查询(测试懒加载)
            VideoOrderMapper videoOrderMapper = sqlSession.getMapper(VideoOrderMapper.class);
            List<VideoOrder> videoOrderList = videoOrderMapper.queryVideoOrderListLazy();
            System.out.println(videoOrderList.size());

            for(VideoOrder videoOrder : videoOrderList){

                System.out.println(videoOrder.getVideoTitle());


                System.out.println(videoOrder.getUser().getName());
            }


        }

    }

}
