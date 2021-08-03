package net.xdclass.sp.domain;

import org.springframework.stereotype.Component;

public class Video {

    private int id;

    private String title;


    public Video(){

    }

    public Video(String title){
        System.out.println("video 带参数构造函数被调用");
        this.title = title;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Video setId方法被调用");
        this.id = id;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {

        System.out.println("Video setTitle方法被调用");
        this.title = title;
    }
}
