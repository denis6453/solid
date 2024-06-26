package homework.impl;

import homework.Model.User;
import homework.Report;

public class UserReport implements Report {

    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
