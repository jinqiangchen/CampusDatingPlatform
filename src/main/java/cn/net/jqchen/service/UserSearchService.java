package cn.net.jqchen.service;

import cn.net.jqchen.model.User;

import java.util.List;

public interface UserSearchService {
    List<User>  searchById(String name);
}
