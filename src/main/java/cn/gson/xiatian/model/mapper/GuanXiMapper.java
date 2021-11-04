package cn.gson.xiatian.model.mapper;

import cn.gson.xiatian.model.pojos.Guanxi;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GuanXiMapper {
    //查询关系
    public List<Guanxi> selGuanxi();

}
