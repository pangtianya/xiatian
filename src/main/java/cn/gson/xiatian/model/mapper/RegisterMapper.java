package cn.gson.xiatian.model.mapper;

import cn.gson.xiatian.model.pojos.Register;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RegisterMapper {
    //添加病人
    public void addRegister(Register register);

//    查询病人
    public List<Register> selRegister(String reName);
}
