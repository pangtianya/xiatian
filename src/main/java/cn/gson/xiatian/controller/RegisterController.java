package cn.gson.xiatian.controller;

import cn.gson.xiatian.model.pojos.Register;
import cn.gson.xiatian.model.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class RegisterController {
    @Autowired
    RegisterService service;

    //添加病人
    @PostMapping("/add-register")
    public String addRegister(@RequestBody Register register){
        System.err.println(register.toString());
        service.addRegister(register);
        return "ok";
    }

    //    查询病人
    @RequestMapping("/sel-register")
    public List<Register> selRegister(String reName){
        return service.selRegister(reName);
    }
}
