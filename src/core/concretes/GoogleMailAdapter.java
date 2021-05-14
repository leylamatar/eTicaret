package core.concretes;

import Entities.concretes.User;
import core.abstracts.EmailService;
import core.abstracts.GoogleService;

public class GoogleMailAdapter implements EmailService {


    @Override
    public boolean CheckIfTrueMail(String eMail) {
        GoogleMailManager googleMailManager = new GoogleMailManager();
        return googleMailManager.CheckIfTrueMail(eMail);
    }
}
