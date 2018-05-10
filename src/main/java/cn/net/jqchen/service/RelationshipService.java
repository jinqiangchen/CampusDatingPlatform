package cn.net.jqchen.service;

public interface RelationshipService {
    void addFriend(String userId,String otherId);
    boolean judgeFriend(String userId,String otherId) ;
}
