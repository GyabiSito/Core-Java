package controllers;

import dao.UserAccountDAO;
import dao.UserAccountDAOImpl;
import model.Interest;
import model.UserAccount;

public class UserAccountController {
    public static void main(String[] args) {
        UserAccountController userAccountController = new UserAccountController();
        userAccountController.findAllUsers();

    }

    public void registerUser() {
        UserAccountDAO dao = new UserAccountDAOImpl();
        UserAccount userAccount = new UserAccount();
        userAccount.setId(1);
        userAccount.setAge(18);
        userAccount.setCity("San Francisco");
        userAccount.setCountry("USA");
        userAccount.setEmail("a@b.com");
        userAccount.setGender("male");
        userAccount.setPassword("1234");
        userAccount.setPhoneNumber("12345678");
        Interest interest = new Interest();
        interest.setId(1);
        interest.setLikes("watching movies");
        interest.setDislikes("playing chess");
        userAccount.setInterest(interest);
        dao.save(userAccount);
        System.out.println(dao.findById(1));
    }

    public void findAllUsers() {
        UserAccountDAO dao = new UserAccountDAOImpl();
        UserAccount userAccount = new UserAccount();
        userAccount.setId(1);
        userAccount.setAge(18);
        userAccount.setCity("San Francisco");
        userAccount.setCountry("USA");
        userAccount.setEmail("a@b.com");
        userAccount.setGender("male");
        userAccount.setPassword("1234");
        userAccount.setPhoneNumber("12345678");
        Interest interest = new Interest();
        interest.setId(1);
        interest.setLikes("watching movies");
        interest.setDislikes("playing chess");
        userAccount.setInterest(interest);
        dao.save(userAccount);

        UserAccount userAccount2 = new UserAccount();
        userAccount2.setId(2);
        userAccount2.setAge(18);
        userAccount2.setCity("San Francisco");
        userAccount2.setCountry("USA");
        userAccount2.setEmail("a@b.com");
        userAccount2.setGender("male");
        userAccount2.setPassword("1234");
        userAccount2.setPhoneNumber("12345678");
        Interest interest2 = new Interest();
        interest2.setId(2);
        interest2.setLikes("watching movies");
        interest2.setDislikes("playing chess");
        userAccount.setInterest(interest2);
        dao.save(userAccount2);

        UserAccount userAccount3 = new UserAccount();
        userAccount3.setId(3);
        userAccount3.setAge(18);
        userAccount3.setCity("San Francisco");
        userAccount3.setCountry("USA");
        userAccount3.setEmail("a@b.com");
        userAccount3.setGender("male");
        userAccount3.setPassword("1234");
        userAccount3.setPhoneNumber("12345678");
        Interest interest3 = new Interest();
        interest3.setId(3);
        interest3.setLikes("watching movies");
        interest3.setDislikes("playing chess");
        userAccount.setInterest(interest3);
        dao.save(userAccount3);

        dao.delete(2);
        System.out.println(dao.findAll());
        System.out.println();
        System.out.println(dao.findMatches(18,"San Francisco"));
    }
}
