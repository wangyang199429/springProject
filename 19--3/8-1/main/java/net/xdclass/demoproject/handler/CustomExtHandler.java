package net.xdclass.demoproject.handler;


import net.xdclass.demoproject.utils.JsonData;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 标记这个是一个异常处理类
 */
@RestControllerAdvice
public class CustomExtHandler {



    @ExceptionHandler(value = Exception.class)
    JsonData handlerException(Exception e, HttpServletRequest request){

        return JsonData.buildError("服务端出问题了", -2);
    }




}
