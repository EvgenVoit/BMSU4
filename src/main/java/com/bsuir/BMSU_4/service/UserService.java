package com.bsuir.BMSU_4.service;

import com.bsuir.BMSU_4.model.User;

import java.util.List;
import java.util.Map;


public interface UserService {

    User signUp(User user);

    List<User> showAllUsers();

    User addUser(User user);

    User updateUser(User user);

    void deleteUser(String email);

    User getUserByEmail(String email);

    void deleteUserById(Integer id);

    Object getTotalUsers();
}
