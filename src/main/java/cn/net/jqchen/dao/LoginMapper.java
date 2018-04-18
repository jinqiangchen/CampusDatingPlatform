package cn.net.jqchen.dao;

import cn.net.jqchen.model.Login;
import cn.net.jqchen.model.LoginExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoginMapper {
    int countByExample(LoginExample example);

    int deleteByExample(LoginExample example);

    int deleteByPrimaryKey(Integer loginId);

    int insert(Login record);

    int insertSelective(Login record);

    List<Login> selectByExample(LoginExample example);

    Login selectByPrimaryKey(Integer loginId);

    int updateByExampleSelective(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByExample(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
}