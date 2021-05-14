package business.concretes;

import Entities.concretes.User;
import business.abstracts.VerificationCheckService;

import java.util.regex.Pattern;

public class VerificationCheckManager implements VerificationCheckService {
   public static final Pattern mailRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);


    @Override
    public boolean CheckUser(String FirstName ,String LastName) {
        if(FirstName.length()>=2 && LastName.length()>=2){
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public boolean CheckEmail(String eMail) {

        return mailRegex.matcher(eMail).find();
    }

    @Override
    public boolean CheckPassword(String password) {
        if (password.length()>=6){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void SendVerificationMail(String eMail) {
        System.out.println("please Check your inbox mail");

    }

    @Override
    public void Verification(User user) {
        System.out.println(user.geteMail() + "your email address was successfully verified. " );
    }
}
