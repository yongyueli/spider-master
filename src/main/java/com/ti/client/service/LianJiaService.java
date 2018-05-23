package com.ti.client.service;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="service-lianjia")
public interface LianJiaService {
    @RequestMapping(value = "/lianjia/areaPage",method=RequestMethod.GET)
    JSONObject areaPage(@RequestParam(value="area")String area,@RequestParam(value = "page")int page);
}
