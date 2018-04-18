package cn.net.jqchen.dao;

import cn.net.jqchen.model.Relationship;
import cn.net.jqchen.model.RelationshipExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RelationshipMapper {
    int countByExample(RelationshipExample example);

    int deleteByExample(RelationshipExample example);

    int deleteByPrimaryKey(Integer owerId);

    int insert(Relationship record);

    int insertSelective(Relationship record);

    List<Relationship> selectByExample(RelationshipExample example);

    Relationship selectByPrimaryKey(Integer owerId);

    int updateByExampleSelective(@Param("record") Relationship record, @Param("example") RelationshipExample example);

    int updateByExample(@Param("record") Relationship record, @Param("example") RelationshipExample example);

    int updateByPrimaryKeySelective(Relationship record);

    int updateByPrimaryKey(Relationship record);
}