package core.abstracts;

import Entities.concretes.User;

public interface EmailService {
    static void send(String eMail, String massage) {

    }

    boolean CheckIfTrueMail(String eMail);
}
