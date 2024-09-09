package services;

import users.Manager;
import users.User;

import java.util.ArrayList;
import java.util.List;

public class Rh {
    private String name;
    private List<User> users;

    public Rh(String name) {
        this.name = name;
        this.users = new ArrayList<User>();
    }
}
