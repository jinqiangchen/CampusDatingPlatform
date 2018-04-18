package cn.net.jqchen.service.impl;

import cn.net.jqchen.dao.LoginMapper;
import cn.net.jqchen.model.Login;
import cn.net.jqchen.model.LoginExample;
import cn.net.jqchen.service.UpdatePwdService;
import cn.net.jqchen.utils.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UpdatePwdServiceImpl implements UpdatePwdService {
    @Resource
    LoginMapper loginMapper;
    @Override
    public void updatePwd(Login login) {
        login.setLoginPwd(MD5Util.md5(login.getLoginPwd()));
        String account=login.getLoginAccount();
        LoginExample example=new LoginExample();
        LoginExample.Criteria criteria=example.createCriteria();
        criteria.andLoginAccountEqualTo(account);
        loginMapper.updateByExampleSelective(login,example);
    }
}
