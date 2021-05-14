package business.abstracts;

import Entities.concretes.User;

public interface VerificationCheckService {
    boolean CheckUser(String FirstName,String LastName);
    boolean CheckEmail(String eMail);
    boolean CheckPassword(String password);
    void SendVerificationMail(String eMail);
    void Verification(User user);
}
