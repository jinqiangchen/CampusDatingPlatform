package cn.net.jqchen.controller;

import cn.net.jqchen.model.*;
import cn.net.jqchen.service.LoginService;
import cn.net.jqchen.utils.CampusResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Resource
    private LoginService loginService;

    @RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
    @ResponseBody
    public CampusResult login(Login login, HttpServletRequest request)  {
        CampusResult result=new CampusResult();
        String auto=request.getParameter("auto");
        Login logIn=loginService.login(login);
        if(null==logIn){
            result.setMsg("用户名或密码出错！");
            result.setData(0);
        }
        else {
            request.getSession().setAttribute("account", login.getLoginAccount());
            if(auto==null ){
                if (1 == logIn.getAccountDegree())//普通用户
                {
                    result.setData(1);
                } else if (2 == logIn.getAccountDegree())//超管
                {
                    result.setData(2);
                } else if (0 == logIn.getAccountDegree()) {
                    result.setData(3);//管理员
                }
            }
            else {

            }
        }
        return result;
    }
    @RequestMapping("/backpwd")
    public String backpwd(){
        return "backpwd";
    }

    @RequestMapping("/menu")
    public String menu(){
        return "menu";
    }
    @RequestMapping("/menu_left")
    public String menu_left(){
        return "menu_left";
    }
    @RequestMapping("/menu_right")
    public String toMenu(HttpServletRequest request) {
        String id=(String)request.getSession().getAttribute("account");
        List<Dynamic> dynamicsList= loginService.selectById(id);
        request.getSession().setAttribute("dynamicList",dynamicsList);
        return "menu_right";
    }
    @RequestMapping("/aboutme")
    public String aboutme(){
        return "aboutme";
    }
    @RequestMapping("/about_left")
    public String about_left(){
        return "about_left";
    }
    @RequestMapping("/about_right")
    public String About(HttpServletRequest request){
        String id=(String)request.getSession().getAttribute("account");
        User user=loginService.selectByAccount(id);
        request.getSession().setAttribute("currentUser",user);
        return "about_right";
    }
    @RequestMapping("/myphoto")
    public String myphoto(){
        return "myphoto";
    }
     @RequestMapping("/myphoto_content")
    public String MyPhoto(HttpServletRequest request){
         String id=(String)request.getSession().getAttribute("account");
         List<Photo> photoList =loginService.selectPhotoById(id);
         request.getSession().setAttribute("photoList",photoList);
        return "myphoto_content";
}
    @RequestMapping("/myvideo")
    public String MyVideo(HttpServletRequest request ){
        String id=(String)request.getSession().getAttribute("account");
        List<Video> videoList=loginService.selectVideoById(id);
        request.getSession().setAttribute("videoList",videoList);
        return "myvideo";
    }
    @RequestMapping("/myfriends")
    public String MyFriends(HttpServletRequest request){
        String account=(String)request.getSession().getAttribute("account");
        List<Relationship> friendList=loginService.selectFriendById(account);
        request.getSession().setAttribute("friendList",friendList);
        return "myfriends";
    }
    @RequestMapping("/admin")
    public String Admin(){
        return "admin";
    }
    @RequestMapping("/superAdmin")
    public String SuperAdmin(){
        return "superAdmin";
    }
    @RequestMapping("/in")
    public String in(){
        return "redirect:/login.jsp";
    }
    @RequestMapping("/register")
    public String register(){
        return "redirect:/register.jsp";
    }
    @RequestMapping("/logout")
    public String logout(){
        return "redirect:/login.jsp";
    }
    @RequestMapping("setQuestion")
    public String setQuestion(){
        return "setQuestion";
    }
    @RequestMapping("updatePwd")
    public String updatePwd(){
        return "updatePwd";
    }
    @RequestMapping("/showSearch")
    public String showSearch(){
        return "searchShow";
    }
    @RequestMapping("/chat")
    public String chat(){
        return "chat";
    }
    @RequestMapping("/header")
    public String header(){
        return "header";
    }
    @RequestMapping("/myfriend_left")
        public String myFriend_left(){
        return "myfriend_left";
        }
    @RequestMapping("/myfriend")
    public String myfriend(){
        return "myfriend";
    }


}
