package net.xdclass.sp.service;

import net.xdclass.sp.domain.Video;
import org.springframework.stereotype.Component;

@Component("videoService")
public class VideoServiceImpl implements VideoService {

    public int save(Video video) {

        System.out.println("保存video");

        return 1;
    }

    public Video findById(int id) {

        System.out.println("根据id找视频");

        return new Video();
    }
}
