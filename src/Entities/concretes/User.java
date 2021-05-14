package Entities.concretes;


import Entities.abstracts.Entity;

public class User implements Entity {
        private String FirstName;
        private String LastName;
        private String eMail;
        private String password;

        public User(){
        super();
        }

        public User(String FirstName,String LastName,String eMail,String password) {
            super();
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.eMail = eMail;
            this.password = password;
        }

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }

        public String geteMail() {
            return eMail;
        }

        public void seteMail(String eMail) {
            this.eMail = eMail;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
}
