package cn.net.jqchen.controller;

import cn.net.jqchen.pojo.Register;
import cn.net.jqchen.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping("/register")
public class RegisterController {
@Resource
    private RegisterService registerService;
    @RequestMapping(value = "/registerIn", method = RequestMethod.POST)
    public String register(Register register){
      //  System.out.println("sssssss");
    //CampusResult result=new CampusResult();
   registerService.register(register);
   // result.setData(1);
    return "redirect:/login.jsp";
}
}
