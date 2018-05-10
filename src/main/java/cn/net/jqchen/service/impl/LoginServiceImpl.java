package cn.net.jqchen.service.impl;

import cn.net.jqchen.dao.*;
import cn.net.jqchen.model.*;
import cn.net.jqchen.service.LoginService;
import cn.net.jqchen.utils.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
     LoginMapper loginMapper;
    @Resource
    DynamicMapper dynamicMapper;
    @Resource
    UserMapper userMapper;
    @Resource
    PhotoMapper photoMapper;
    @Resource
    VideoMapper videoMapper;
    @Resource
    RelationshipMapper relationshipMapper;
    @Override
    public Login login(Login login) {
        login.setLoginPwd(MD5Util.md5(login.getLoginPwd()));
        LoginExample example=new LoginExample();
        LoginExample.Criteria criteria=example.createCriteria();
        criteria.andLoginAccountEqualTo(login.getLoginAccount()).andLoginPwdEqualTo(login.getLoginPwd());
        List<Login> list=loginMapper.selectByExample(example);
        //System.out.println(list.get(0).toString());
        return (list == null || list.size() == 0 )? null : list.get(0);
    }

    @Override
    public List<Dynamic> selectById(String id) {
        DynamicExample example=new DynamicExample();
        DynamicExample.Criteria criteria=example.createCriteria();
        criteria.andPublisherIdEqualTo(id);
        List<Dynamic> list=dynamicMapper.selectByExample(example);
        return list;
    }

    @Override
    public User selectByAccount(String account) {
        User user=userMapper.selectByPrimaryKey(account);
        return user;
    }

    @Override
    public List<Photo> selectPhotoById(String account) {
        PhotoExample example=new PhotoExample();
        PhotoExample.Criteria criteria=example.createCriteria();
        criteria.andOwerIdEqualTo(account);
        List<Photo> photoList=photoMapper.selectByExample(example);
        return photoList;
    }

    @Override
    public List<Video> selectVideoById(String account) {
        VideoExample example=new VideoExample();
        VideoExample.Criteria criteria=example.createCriteria();
        criteria.andOwerIdEqualTo(account);
        List<Video> videoList=videoMapper.selectByExample(example);
        return videoList;
    }

    @Override
    public List<Relationship> selectFriendById(String account) {
        RelationshipExample example=new RelationshipExample();
        RelationshipExample.Criteria criteria=example.createCriteria();
        criteria.andOwerIdEqualTo(account);
        List<Relationship> friendsList=relationshipMapper.selectByExample(example);
        return friendsList;
    }

}
