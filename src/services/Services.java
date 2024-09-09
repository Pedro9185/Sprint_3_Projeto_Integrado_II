package services;

import users.User;

public interface Services {
    void clockIn(User user);
    void manage(User user);
    void payroll();
    void vocation();
    void absences();
}
