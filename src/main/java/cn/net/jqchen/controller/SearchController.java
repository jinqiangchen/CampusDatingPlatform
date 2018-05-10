package cn.net.jqchen.controller;

import cn.net.jqchen.model.User;
import cn.net.jqchen.service.UserSearchService;
import cn.net.jqchen.utils.CampusResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/search")
public class SearchController {
    @Resource
    UserSearchService userSearchService;
    @ResponseBody
    @RequestMapping("/searchByName")

    public CampusResult searchUser(String name, HttpServletRequest request){
        CampusResult result=new CampusResult();
        List<User> userList=userSearchService.searchById(name);
        //System.out.println(userList.get(1).getUserAccount());
        if(userList.size()==0||userList==null){
            result.setData(0);
        }
        else{

            request.getSession().setAttribute("userList",userList);
            result.setData(1);
        }
        return result;
    }

}
