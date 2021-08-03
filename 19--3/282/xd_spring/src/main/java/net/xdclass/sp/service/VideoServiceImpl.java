package net.xdclass.sp.service;

import net.xdclass.sp.config.CustomConfig;
import net.xdclass.sp.dao.VideoDao;
import net.xdclass.sp.domain.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("videoService")
@Service("videoService")
public class VideoServiceImpl implements VideoService {


    @Autowired
    private VideoDao videoDao;


    @Autowired
    private CustomConfig customConfig;


    public int save(Video video) {

        System.out.println("保存video");


        return 1;
    }

    public Video findById(int id) {

        System.out.println("根据id找视频");
        videoDao.test();

        System.out.println(customConfig.getHost());

        return new Video();
    }
}
