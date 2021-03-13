package cn.hcx.Service;

import cn.hcx.Dao.UserDao;

public class UserService{
    UserDao userDao;
    public UserService(UserDao userDao){
        this.userDao=userDao;
    }
    public void GetUser(){
        userDao.UserSaying();
    }
}
