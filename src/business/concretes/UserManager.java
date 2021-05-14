package business.concretes;

import Entities.concretes.User;
import business.abstracts.VerificationCheckService;
import business.abstracts.UserService;
import core.abstracts.EmailService;
import dataAccess.abstracts.UserDao;

public class UserManager implements UserService {
   private UserDao userDao;
   private VerificationCheckService verificationCheckService;

public UserManager (UserDao userDao, VerificationCheckService verificationCheckService){
    super();
    this.userDao = userDao;
    this.verificationCheckService = verificationCheckService;
}
    @Override
    public void login(String eMail, String password) {
        User user = new User();
        user.seteMail(eMail);
        user.setPassword(password);
        userDao.add(user);
        System.out.println("Account : "+user.geteMail());
        System.out.println("Password : "+ user.getPassword());
        EmailService.send(eMail,"You have logged in");

    }
}
