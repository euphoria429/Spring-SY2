package cn.hcx.factory;

import cn.hcx.Dao.UserDao;

public class DaoBeanFactory {
    public UserDao CreateDaoBean(){
        return new UserDao();
    }
}
