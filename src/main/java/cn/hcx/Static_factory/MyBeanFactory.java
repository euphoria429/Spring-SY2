package cn.hcx.Static_factory;

import cn.hcx.Dao.UserDao;

public class MyBeanFactory {
    public static UserDao createBean(){
        return new UserDao();
    }
}

