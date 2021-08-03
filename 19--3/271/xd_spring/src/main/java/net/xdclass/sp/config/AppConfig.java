package net.xdclass.sp.config;

import net.xdclass.sp.domain.VideoOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {


    //使用@bean注解，表明这个bean交个spring 进行管理
    // 如果没有指定名称，默认采用 方法名 + 第一个字母小写 作为bean的名称
    @Bean(name = "videoOrderName",initMethod = "init",destroyMethod = "destroy")
    @Scope
    public VideoOrder videoOrder(){
        return new VideoOrder();
    }


    //使用@bean注解，表明这个bean交个spring 进行管理
    // 如果没有指定名称，默认采用 方法名 + 第一个字母小写 作为bean的名称
//    @Bean(name = "videoOrderName",initMethod = "init",destroyMethod = "destroy")
//    @Scope
//    public VideoOrder videoOrder(){
//        return new VideoOrder();
//    }

}
