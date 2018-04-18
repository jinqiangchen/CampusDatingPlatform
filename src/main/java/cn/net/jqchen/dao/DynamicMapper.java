package cn.net.jqchen.dao;

import cn.net.jqchen.model.Dynamic;
import cn.net.jqchen.model.DynamicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicMapper {
    int countByExample(DynamicExample example);

    int deleteByExample(DynamicExample example);

    int deleteByPrimaryKey(Integer dynamicId);

    int insert(Dynamic record);

    int insertSelective(Dynamic record);

    List<Dynamic> selectByExample(DynamicExample example);

    Dynamic selectByPrimaryKey(Integer dynamicId);

    int updateByExampleSelective(@Param("record") Dynamic record, @Param("example") DynamicExample example);

    int updateByExample(@Param("record") Dynamic record, @Param("example") DynamicExample example);

    int updateByPrimaryKeySelective(Dynamic record);

    int updateByPrimaryKey(Dynamic record);
}