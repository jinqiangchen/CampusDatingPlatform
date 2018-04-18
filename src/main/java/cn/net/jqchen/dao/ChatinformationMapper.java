package cn.net.jqchen.dao;

import cn.net.jqchen.model.Chatinformation;
import cn.net.jqchen.model.ChatinformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChatinformationMapper {
    int countByExample(ChatinformationExample example);

    int deleteByExample(ChatinformationExample example);

    int deleteByPrimaryKey(Integer chatId);

    int insert(Chatinformation record);

    int insertSelective(Chatinformation record);

    List<Chatinformation> selectByExample(ChatinformationExample example);

    Chatinformation selectByPrimaryKey(Integer chatId);

    int updateByExampleSelective(@Param("record") Chatinformation record, @Param("example") ChatinformationExample example);

    int updateByExample(@Param("record") Chatinformation record, @Param("example") ChatinformationExample example);

    int updateByPrimaryKeySelective(Chatinformation record);

    int updateByPrimaryKey(Chatinformation record);
}