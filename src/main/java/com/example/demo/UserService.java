package com.example.demo;


import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private final Map<Integer, User> users = new HashMap<>();
    private int counter = 1;

    public User createUser(User user) {
        user.setId(counter++);
        users.put(user.getId(), user);
        return user;
    }

    public Collection<User> getAllUsers() {
        return users.values();
    }

    public User getUser(int id) {
        return users.get(id);
    }

    public User updateUser(int id, User user) {
        user.setId(id);
        users.put(id, user);
        return user;
    }

    public void deleteUser(int id) {
        users.remove(id);
    }
}
