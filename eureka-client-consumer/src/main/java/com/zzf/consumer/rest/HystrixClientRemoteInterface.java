package com.zzf.consumer.rest;

import com.zzf.consumer.hystrix.HystrixClientConfigration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zzf
 * @date: 2018/3/5
 * @time: 13:32
 * @description : 远程调用， 使用类作的方法作为容错的方法
 */
@FeignClient(name = "eureka-client-provider", configuration = HystrixClientConfigration.class)
public interface HystrixClientRemoteInterface {

    @RequestMapping(value = "/getTeamInfo", method = RequestMethod.GET)
    public String getTeamInfo(@RequestParam("teamName") String teamName);
}
