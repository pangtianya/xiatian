package cn.gson.xiatian.model.service;

import cn.gson.xiatian.model.mapper.GuanXiMapper;
import cn.gson.xiatian.model.pojos.Guanxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuanXiService {

    @Autowired
    GuanXiMapper mapper;

    //查询关系
    public List<Guanxi> selGuanxi(){
        return mapper.selGuanxi();
    }
}
