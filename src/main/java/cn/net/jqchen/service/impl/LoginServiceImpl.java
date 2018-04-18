package cn.net.jqchen.service.impl;

import cn.net.jqchen.dao.LoginMapper;
import cn.net.jqchen.model.Login;
import cn.net.jqchen.model.LoginExample;
import cn.net.jqchen.service.LoginService;
import cn.net.jqchen.utils.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginMapper loginMapper;
    @Override
    public Login login(Login login) {
        login.setLoginPwd(MD5Util.md5(login.getLoginPwd()));
        LoginExample example=new LoginExample();
        LoginExample.Criteria criteria=example.createCriteria();
        criteria.andLoginAccountEqualTo(login.getLoginAccount()).andLoginPwdEqualTo(login.getLoginPwd());
        List<Login> list=loginMapper.selectByExample(example);
        //System.out.println(list.get(0).toString());
        return (list == null || list.size() == 0 )? null : list.get(0);
    }
}
