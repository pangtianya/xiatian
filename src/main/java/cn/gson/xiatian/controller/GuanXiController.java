package cn.gson.xiatian.controller;

import cn.gson.xiatian.model.pojos.Guanxi;
import cn.gson.xiatian.model.service.GuanXiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class GuanXiController {

    @Autowired
    GuanXiService service;

    //查询关系
    @RequestMapping("/sel-guanxi")
    public List<Guanxi> selGuanxi(){
        return service.selGuanxi();
    }
}
