package cn.net.jqchen.controller;

import cn.net.jqchen.model.Login;
import cn.net.jqchen.service.LoginService;
import cn.net.jqchen.utils.CampusResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Resource
    private LoginService loginService;

    @RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
    @ResponseBody
    public CampusResult login(Login login, HttpServletRequest request)  {
        CampusResult result=new CampusResult();
        Login logIn=loginService.login(login);
        if(null==logIn){
            result.setMsg("用户名或密码出错！");
            result.setData(0);
        }
        else {
            request.getSession().setAttribute("account", login.getLoginAccount());
            if(1==logIn.getAccountDegree())//普通用户
            {
                result.setData(1);
            }
            else if(2==logIn.getAccountDegree())//超管
            {
                result.setData(2);
            }
            else if(0==logIn.getAccountDegree()){
                result.setData(3);//管理员
            }

        }
        return result;
    }
    @RequestMapping("/menu")
    public String toMenu() {
        return "menu";
    }
    @RequestMapping("/aboutme")
    public String About(){
        return "aboutme";
    }
     @RequestMapping("/myphoto")
    public String MyPhoto(){
        return "myphoto";
}
    @RequestMapping("/myvideo")
    public String MyVideo(){
        return "myvideo";
    }
    @RequestMapping("/myfriends")
    public String MyFriends(){
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
    @RequestMapping("/logout")
    public String logout(){
        return "redirect:/login.jsp";
    }
    @RequestMapping("setQuestion")
    public String setQuestion(){
        return "redirect:/setQuestion.jsp";
    }
    @RequestMapping("updatePwd")
    public String updatePwd(){
        return "redirect:/updatePwd.jsp";
    }
}
