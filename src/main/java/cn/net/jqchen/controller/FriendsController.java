package cn.net.jqchen.controller;

import cn.net.jqchen.service.RelationshipService;
import cn.net.jqchen.utils.CampusResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/friends")
public class FriendsController {
    @Resource
    RelationshipService relationshipService;
    @RequestMapping("/addFriends")
    @ResponseBody
    public CampusResult addFriends(String userAccount, HttpServletRequest request){
        CampusResult result=new CampusResult();
        String currentUser= (String) request.getSession().getAttribute("account");
           if(userAccount.equals(userAccount)){
               result.setData(2);
           }
           else if(relationshipService.judgeFriend(currentUser,userAccount)){
              result.setData(1);
           }
           else {
               relationshipService.addFriend(currentUser, userAccount);
               result.setData(0);
           }
        return result;
}

}
