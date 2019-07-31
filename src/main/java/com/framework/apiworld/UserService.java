package com.framework.apiworld;

import com.framework.apiworld.beans.User;

import java.util.List;



public interface UserService {
    public void createUser(User user);
    public List<User> getUser();
    public User findById(int id);
    public void update(User user);
    public void deleteUserById(int id);
    public void updatePartially(User user, int id);
}