package cn.gson.xiatian.model.service;

import cn.gson.xiatian.model.mapper.RegisterMapper;
import cn.gson.xiatian.model.pojos.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {
    @Autowired
    RegisterMapper mapper;

    //添加病人
    public void addRegister(Register register){
        mapper.addRegister(register);
    }

    //    查询病人
    public List<Register> selRegister(String reName){
        return mapper.selRegister(reName);
    }
}
