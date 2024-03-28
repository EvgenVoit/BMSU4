package com.bsuir.BMSU_4.rest;

import com.bsuir.BMSU_4.model.User;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/user")
public interface UserRest {

    @PostMapping("/signup") //work
    public String signUp(@RequestBody User user);

    @GetMapping("/all") //work
    public List<User> showAllUsers();

    @PutMapping("/update-user")  //not working!!!
    public String updateUser(@RequestBody User user);

    @PostMapping("/add-user") //work
    public String addUser(@RequestBody User user);

    @GetMapping("/getByEmail/{email}")  //work
    public User getUserByEmail(@PathVariable String email);

    @GetMapping("/user-statistics") //work
    public Map<String, Object> getUserStatistics();

    @DeleteMapping("/delete-user/{id}") //work
    @Transactional
    public void deleteUser(@PathVariable Integer id);
}
