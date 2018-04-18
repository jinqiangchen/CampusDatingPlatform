package cn.net.jqchen.dao;

import cn.net.jqchen.model.Backpwd;
import cn.net.jqchen.model.BackpwdExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BackpwdMapper {
    int countByExample(BackpwdExample example);

    int deleteByExample(BackpwdExample example);

    int deleteByPrimaryKey(String userAccount);

    int insert(Backpwd record);

    int insertSelective(Backpwd record);

    List<Backpwd> selectByExample(BackpwdExample example);

    Backpwd selectByPrimaryKey(String userAccount);

    int updateByExampleSelective(@Param("record") Backpwd record, @Param("example") BackpwdExample example);

    int updateByExample(@Param("record") Backpwd record, @Param("example") BackpwdExample example);

    int updateByPrimaryKeySelective(Backpwd record);

    int updateByPrimaryKey(Backpwd record);
}