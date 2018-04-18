package cn.net.jqchen.service.impl;

import cn.net.jqchen.dao.BackpwdMapper;
import cn.net.jqchen.model.Backpwd;
import cn.net.jqchen.service.SetQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SetQuestionServiceImpl implements SetQuestionService {
    @Resource
    BackpwdMapper backpwdMapper;
    @Override
    public void setQuestion(Backpwd backpwd) {
        String account=backpwd.getUserAccount();
        Backpwd backpwd1=backpwdMapper.selectByPrimaryKey(account);
        if(backpwd1==null) {
            backpwdMapper.insert(backpwd);
        }
        else{
            backpwdMapper.updateByPrimaryKey(backpwd);
        }
    }

    @Override
    public boolean confirmQuestion(String userAccount) {
        Backpwd backpwd=backpwdMapper.selectByPrimaryKey(userAccount);
        if(backpwd==null){
            return false;
        }
        else{
            return true;
        }
    }
}
