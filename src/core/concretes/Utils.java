package core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static boolean emailValidate(String eMail){
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(eMail);
        System.out.println(eMail +" : "+ matcher.matches());
        return matcher.matches();
}

}
