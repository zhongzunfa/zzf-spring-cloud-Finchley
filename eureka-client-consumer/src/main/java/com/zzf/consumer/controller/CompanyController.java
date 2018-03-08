package com.zzf.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zzf.consumer.rest.HystrixClientRemoteInterface;
import com.zzf.consumer.rest.RemoteInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zzf
 * @date: 2018/3/4
 * @time: 14:05
 * @description : do some thing
 */

@Controller
@RequestMapping("company")
public class CompanyController {

    @Autowired
    private RemoteInterface remoteInterface;

    @Autowired
    private HystrixClientRemoteInterface hystrixClientRemoteInterface;

    /**
     * 容错方法在接口实现类中
     * @param teamName
     * @return
     */
    @RequestMapping(value = "/teamInfo", method = RequestMethod.GET)
    @ResponseBody
    public String getTeamInfo(String teamName){
        return hystrixClientRemoteInterface.getTeamInfo(teamName);
    }

    @HystrixCommand(fallbackMethod = "getCompanyInfoFallback")
    @RequestMapping(value = "/companyInfo", method = RequestMethod.GET)
    @ResponseBody
    public String getCompanyInfo(String companyName){

        return remoteInterface.getCompanyInfoByProvider(companyName);
    }

    /**
     * 主要注意的是： 容错的方法， 参数要与请求的一致。
     * 容错返回的方法
     * @return
     */
    public String getCompanyInfoFallback(String companyName){
        return "this is fallBack, company name is " + companyName;
    }

}
