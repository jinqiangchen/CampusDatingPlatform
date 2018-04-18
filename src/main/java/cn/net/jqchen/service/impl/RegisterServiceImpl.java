package cn.net.jqchen.service.impl;

import cn.net.jqchen.dao.LoginMapper;
import cn.net.jqchen.dao.UserMapper;
import cn.net.jqchen.model.Login;
import cn.net.jqchen.model.User;
import cn.net.jqchen.pojo.Register;
import cn.net.jqchen.service.RegisterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.sql.Timestamp;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Resource
    LoginMapper loginMapper;
    @Resource
    UserMapper userMapper;
    @Override
    public void register(Register register) {
        String Account=register.getUsername();
        String password=register.getPassword();
        String nickName=register.getNickname();
        String realName=register.getRealname();
        Integer age=register.getAge();
        String sex=register.getSex();
        String email=register.getEmail();
        Date birthday=register.getBirthday();
        String hobby=register.getHobby();
        String phone=register.getPhone();
        Login login=new Login();
        login.setLoginAccount(Account);
        login.setLoginPwd(password);
        User user=new User();
        user.setUserAccount(Account);
        user.setUserNickname(nickName);
        user.setUserRealname(realName);
        user.setUserAge(age);
        user.setUserSex(sex);
        user.setUserEmail(email);
        user.setUserBirthday(birthday);
        user.setUserHobby(hobby);
        user.setUserPhone(phone);
        java.util.Date datetime=new java.util.Date();

        //Date registTime=new Date(datetime.getTime());
       java.sql.Timestamp registTime=new Timestamp(datetime.getTime());
       user.setUserRegistertime(registTime);
        int a=loginMapper.insertSelective(login);
        int b=userMapper.insertSelective(user);
        //System.out.println(a+b);
    }
}
