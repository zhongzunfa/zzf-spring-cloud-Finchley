package com.zzf.consumer.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zzf
 * @date: 2018/3/4
 * @time: 23:16
 * @description : 远程调用接口
 */
@FeignClient("eureka-client-provider")
public interface RemoteInterface {

    /**
     * 获取公司信息
     * @param companyName
     * @return
     */
    @RequestMapping(value = "/getCompanyInfoByProvider", method = RequestMethod.GET)
    public String getCompanyInfoByProvider(@RequestParam("companyName") String companyName);
}
