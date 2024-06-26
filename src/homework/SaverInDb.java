package homework;

import homework.Model.User;

public interface SaverInDb {
    <T extends User> void save (User user);
}
