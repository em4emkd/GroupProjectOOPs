package com.syntax.groupproject;


public class Task4 {

        /* Task 4
         * .Create Registration Class in which you would have variables as email,
         * userName and password that have an access scope only within its own
         * class. After creating an object of the class user should be able to call
         * methods and in each method separately pass values to set users email,
         * username and password.
         * Requirements:
         * A.Valid email consider to be only yahoo
         * B.Valid userName and password cannot be empty and should be of
         * length larger than 6 characters. Also valid password cannot contain
         * userName.
         *
         */
        private String email;
        private String userName;
        private String password;

        public boolean isEmailValid(String email) {

            if(!email.contains("yahoo")) {
                return false;
            }
            return true;
        }

        public boolean isPasswordValid(String password) {

            if((password.length()<6)) {
                return false;
            }
            if(password.isEmpty()) {
                return false;
            }
            if(password.equals(userName)) {
                return false;
            }
            return true;
        }

        public boolean isUserNameValid(String userName) {
            if((userName.length()<6)) {
                return false;
            }
            if(userName.isEmpty()) {
                return false;
            }
            return true;
        }


        public static void main(String[] args) {
            Task4 obj = new Task4();

            System.out.println(obj.isEmailValid("test@yahoo.com"));
            System.out.println(obj.isUserNameValid("dato"));
            System.out.println(obj.isPasswordValid("dato"));
        }
}

