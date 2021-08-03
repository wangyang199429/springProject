package net.xdclass.sp.service;

import net.xdclass.sp.domain.Video;

public interface VideoService {

    int save(Video video);

    Video findById(int id);

}
