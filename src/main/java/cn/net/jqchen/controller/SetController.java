package cn.net.jqchen.controller;

import cn.net.jqchen.model.Backpwd;
import cn.net.jqchen.service.SetQuestionService;
import cn.net.jqchen.utils.CampusResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/set")
public class SetController {
@Resource
    SetQuestionService setQuestionService;
    @RequestMapping("/setQuestion")
    @ResponseBody
    public String setQuestion(Backpwd backpwd , HttpServletRequest request){
        String account=(String)request.getSession().getAttribute("account");
        backpwd.setUserAccount(account);
        setQuestionService.setQuestion(backpwd);
        return "menu";
    }


    @RequestMapping(value="/confirmQuestion",method = RequestMethod.POST)
    @ResponseBody
    public CampusResult confirmQuestion(String account){
        CampusResult result=new CampusResult();
       if(!setQuestionService.confirmQuestion(account)) {
           result.setData(0);
       }else {
           result.setData(1);
       }
        return  result;
    }

}
