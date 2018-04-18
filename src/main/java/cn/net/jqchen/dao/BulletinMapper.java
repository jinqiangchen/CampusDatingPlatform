package cn.net.jqchen.dao;

import cn.net.jqchen.model.Bulletin;
import cn.net.jqchen.model.BulletinExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BulletinMapper {
    int countByExample(BulletinExample example);

    int deleteByExample(BulletinExample example);

    int deleteByPrimaryKey(Integer bulletinId);

    int insert(Bulletin record);

    int insertSelective(Bulletin record);

    List<Bulletin> selectByExample(BulletinExample example);

    Bulletin selectByPrimaryKey(Integer bulletinId);

    int updateByExampleSelective(@Param("record") Bulletin record, @Param("example") BulletinExample example);

    int updateByExample(@Param("record") Bulletin record, @Param("example") BulletinExample example);

    int updateByPrimaryKeySelective(Bulletin record);

    int updateByPrimaryKey(Bulletin record);
}