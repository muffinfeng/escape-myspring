package com.muffin.escapemyspring.learnFanXing;

public class UserDao extends BaseDao<User> {

    public UserDao(){
        super();
    }

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
    }

    @Override
    public void add(User user) {
        super.add(user);
    }
}
