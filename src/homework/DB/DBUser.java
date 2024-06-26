package homework.DB;

import homework.Model.User;

import java.util.ArrayList;
import java.util.List;

public class DBUser {
    private static final List<User> usersDb = new ArrayList<>();


    public static void insertUser(User user){
        usersDb.add(user);
    }
}
