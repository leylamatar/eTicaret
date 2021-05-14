package Project;

import Entities.concretes.User;
import business.abstracts.UserService;
import business.concretes.UserManager;
import business.concretes.VerificationCheckManager;
import core.concretes.GoogleMailAdapter;
import core.concretes.GoogleMailManager;
import core.concretes.Utils;
import dataAccess.concretes.HibernateUserDao;
import dataAccess.abstracts.UserDao;
import jdk.jshell.execution.Util;

public class Main {

    public static void main(String[] args) {

        User user = new User("Leyla","Matar","laila@gmail.com","0987545");
        User user1 = new User("Nilay","Besli","Nilay@gmail.com","64545455");
        User user2 = new User("Duygu","Orhan","Duyguorhan","65344565");


        UserManager Manager = new UserManager(new HibernateUserDao(),new VerificationCheckManager());
        Manager.login(user.geteMail(),user.getPassword());
        System.out.println("-------------------------");
        Manager.login(user1.geteMail(), user1.getPassword());
        System.out.println("-------------------------");
        Manager.login(user2.geteMail(), user2.getPassword());
        System.out.println("-------------------------");
        //System.out.println("    Check if Google email");


        GoogleMailAdapter googleMailAdapter = new GoogleMailAdapter();
        //googleMailAdapter.CheckIfTrueMail(user2.geteMail());


        System.out.println("    Check Emails");

        Utils.emailValidate(user.geteMail());
        Utils.emailValidate(user1.geteMail());
        Utils.emailValidate(user2.geteMail());


    }
}
