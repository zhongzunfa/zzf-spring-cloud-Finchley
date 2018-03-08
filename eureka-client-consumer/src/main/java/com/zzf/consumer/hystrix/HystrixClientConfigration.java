package com.zzf.consumer.hystrix;

import com.zzf.consumer.rest.HystrixClientRemoteInterface;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zzf
 * @date: 2018/3/5
 * @time: 15:10
 * @description : 类执行的容错。
 */
public class HystrixClientConfigration implements HystrixClientRemoteInterface {

    @Override
    public String getTeamInfo(String teamName) {

        return "获取" + teamName + "失败。";
    }
}
