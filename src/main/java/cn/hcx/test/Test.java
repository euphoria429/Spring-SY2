package cn.hcx.test;

import cn.hcx.Dao.UserDao;
import cn.hcx.Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=(UserDao)applicationContext.getBean("userDao");
        userDao.UserSaying();
    }
}
