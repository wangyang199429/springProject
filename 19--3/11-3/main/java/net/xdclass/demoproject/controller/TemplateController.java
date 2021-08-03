package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.config.WXConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * localhost:8080/tpl/freemaker
 *
 * localhost:8080/tpl/thymeleaf
 *
 *
 */

@Controller
@RequestMapping("tpl")
class TemplateController {


    @Autowired
    private WXConfig wxConfig;


    @GetMapping("freemaker")
    public String index1(ModelMap modelMap){

        modelMap.addAttribute("setting",wxConfig);

        //不用加后缀，因为配置文件里面已经指定了后缀
        return "user/fm/index";

    }




    @GetMapping("thymeleaf")
    public String index2(ModelMap modelMap){

        modelMap.addAttribute("setting",wxConfig);

        //不用加后缀，因为配置文件里面已经指定了后缀
        return "tl/index";

    }







}
