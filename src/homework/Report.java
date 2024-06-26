package homework;

import homework.Model.User;

public interface Report {
    <T extends User> void report(User user);
}
