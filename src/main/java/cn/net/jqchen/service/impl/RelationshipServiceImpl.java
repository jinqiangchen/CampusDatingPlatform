package cn.net.jqchen.service.impl;

import cn.net.jqchen.dao.RelationshipMapper;
import cn.net.jqchen.model.Relationship;
import cn.net.jqchen.model.RelationshipExample;
import cn.net.jqchen.service.RelationshipService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RelationshipServiceImpl implements RelationshipService{
    @Resource
    RelationshipMapper relationshipMapper;
    @Override
    public void addFriend(String userId, String otherId) {
        Relationship relationship=new Relationship();
        relationship.setOwerId(userId);
        relationship.setFriendId(otherId);
        relationshipMapper.insertSelective(relationship);
    }

    @Override
    public boolean judgeFriend(String userId, String otherId) {
        RelationshipExample example=new RelationshipExample();
        RelationshipExample.Criteria criteria=example.createCriteria();
        criteria.andOwerIdEqualTo(userId).andFriendIdEqualTo(otherId);
        List<Relationship> list=relationshipMapper.selectByExample(example);
        return (list == null || list.size() == 0 )? false : true;//false,不是好友，true,好友
    }
}
