package cn.net.jqchen.dao;

import cn.net.jqchen.model.Superadmin;
import cn.net.jqchen.model.SuperadminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SuperadminMapper {
    int countByExample(SuperadminExample example);

    int deleteByExample(SuperadminExample example);

    int deleteByPrimaryKey(String superadminAccount);

    int insert(Superadmin record);

    int insertSelective(Superadmin record);

    List<Superadmin> selectByExample(SuperadminExample example);

    Superadmin selectByPrimaryKey(String superadminAccount);

    int updateByExampleSelective(@Param("record") Superadmin record, @Param("example") SuperadminExample example);

    int updateByExample(@Param("record") Superadmin record, @Param("example") SuperadminExample example);

    int updateByPrimaryKeySelective(Superadmin record);

    int updateByPrimaryKey(Superadmin record);
}