package cn.net.jqchen.controller;

import cn.net.jqchen.model.Login;
import cn.net.jqchen.service.UpdatePwdService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/update")
public class UpdatePwdController {
@Resource
 private UpdatePwdService updatePwdService;
    @RequestMapping(value="/toLogin",method = RequestMethod.POST)
     public String updatePwd(Login login , HttpServletRequest request){
        String account=(String)request.getSession().getAttribute("account");
        login.setLoginAccount(account);
        updatePwdService.updatePwd(login);
        return "redirect:/login.jsp";
}

}
