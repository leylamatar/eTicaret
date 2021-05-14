package core.concretes;

import Entities.concretes.User;
import core.abstracts.EmailService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoogleMailManager {
   public static boolean CheckIfTrueMail(String eMail) {
       String regex = "@gmail.com";

       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(eMail);
       System.out.println(eMail +" : "+ matcher.matches());

       return matcher.matches();
   }

   }


