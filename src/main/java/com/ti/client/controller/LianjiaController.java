package com.ti.client.controller;

import com.ti.client.service.LianJiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LianjiaController {

    @Autowired
    LianJiaService lianJiaService;
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public @ResponseBody String hi(){
        lianJiaService.areaPage("undefined",0);
        return "ok";
    }
}
