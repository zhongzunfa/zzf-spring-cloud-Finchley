package com.zzf.config.consumer.controller;

import com.zzf.config.consumer.config.AuthorConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zzf
 * @date: 2018/3/5
 * @time: 21:30
 * @description : do some thing
 */
@Controller
@RequestMapping("configConsumer")
public class ConfigConsumerController {

    @Autowired
    private AuthorConfig authorConfig;

    @RequestMapping("/getAuthorInfo")
    @ResponseBody
    public String getAuthorInfo(){

        return " author信息是丛git上加载下来的 ：" + authorConfig.toString();
    }
}
