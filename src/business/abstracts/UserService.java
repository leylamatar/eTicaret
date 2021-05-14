package business.abstracts;

import Entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    void login(String eMail, String password);

    List<User> users = new ArrayList<User>();

}
