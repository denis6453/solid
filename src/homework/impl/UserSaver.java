package homework.impl;

import homework.DB.DBUser;
import homework.SaverInDb;
import homework.Model.User;

public class UserSaver implements SaverInDb {

    @Override
    public <T extends User> void save(User user) {
        DBUser.insertUser(user);
    }
}
