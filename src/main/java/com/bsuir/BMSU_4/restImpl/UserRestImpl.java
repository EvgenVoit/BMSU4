package com.bsuir.BMSU_4.restImpl;

import com.bsuir.BMSU_4.model.User;
import com.bsuir.BMSU_4.rest.UserRest;
import com.bsuir.BMSU_4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {

    @Autowired
    private UserService userService;

    @Override
    public String signUp(User user) {
        userService.signUp(user);
        return "User was registered successfully!";
    }

    @Override
    public List<User> showAllUsers() {
        return userService.showAllUsers();
    }

    @Override
    public String updateUser(User user) {
        userService.updateUser(user);
        return "User was updated successfully!";
    }

    @Override
    public String addUser(User user) {
        userService.addUser(user);
        return "User was registered successfully!";
    }

    @Override
    public User getUserByEmail(String email) {
        return userService.getUserByEmail(email);
    }

    @Override
    public Map<String, Object> getUserStatistics() {
        Map<String, Object> statistics = new HashMap<>();
        statistics.put("totalUsers", userService.getTotalUsers());
        return statistics;
    }

    @Override
    public void deleteUser(Integer id) {
        userService.deleteUserById(id);
    }
}
