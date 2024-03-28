package com.bsuir.BMSU_4.serviseImpl;

import com.bsuir.BMSU_4.DAO.UserDao;
import com.bsuir.BMSU_4.model.User;
import com.bsuir.BMSU_4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User signUp(User user) {
        return userDao.save(user);
    }

    @Override
    public List<User> showAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User addUser(User user) {
        return userDao.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userDao.save(user);
    }

    @Override
    public void deleteUser(String email) {
        userDao.deleteByEmail(email);
    }

    @Override
    public void deleteUserById(Integer id) {
        userDao.deleteById(id);
    }

    @Override
    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    @Override
    public Object getTotalUsers() {
        int number = userDao.findAll().size();
        return (Integer) number;
    }
}
