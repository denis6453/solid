package homework;

import homework.Model.User;
import homework.impl.UserReport;
import homework.impl.UserSaver;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        SaverInDb saver = new UserSaver();
        Report report = new UserReport();
        saver.save(user);
        report.report(user);
    }
}