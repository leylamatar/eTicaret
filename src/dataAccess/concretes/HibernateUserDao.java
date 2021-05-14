package dataAccess.concretes;

import Entities.concretes.User;
import dataAccess.abstracts.UserDao;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    List<User> userList = new ArrayList<User>();


    @Override
    public void add(User user) {
        userList.add(user);


        System.out.println("User Added : "+user.geteMail());


    }

    @Override
    public void delete(User user) {
        System.out.println("User deleted : "+user.getFirstName());

    }

    @Override
    public User get(String eMail,String password) {
        for(User user :userList){
            if (user.geteMail()==(eMail) && user.getPassword()==(password)){

                System.out.println("User mail and the password are matching");
                return user;
            }
            else{
                System.out.println("No user found");

            }
        }
        return null;

    }

    @Override
    public List<User> getAll() {
        return userList;
    }
}
