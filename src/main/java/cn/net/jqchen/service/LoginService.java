package cn.net.jqchen.service;

import cn.net.jqchen.model.*;

import java.util.List;

public interface LoginService {
    public Login login(Login login);
    List<Dynamic> selectById(String id);
    User selectByAccount(String account);
    List<Photo> selectPhotoById(String account);
    List<Video> selectVideoById(String account);
    List<Relationship> selectFriendById(String account);
}

