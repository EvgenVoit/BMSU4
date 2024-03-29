package com.bsuir.BMSU_4.serviseImpl;

import com.bsuir.BMSU_4.DAO.UserRepo;
import com.bsuir.BMSU_4.model.User;
import com.bsuir.BMSU_4.model.enums.Role;
import com.bsuir.BMSU_4.service.UserService2;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService2Impl implements UserService2 {
    @Autowired
    public UserRepo userRepo;

    private final PasswordEncoder passwordEncoder;

    @Override
    public boolean createUser(User user) {
        String email = user.getEmail();
        if (userRepo.findByEmail(email) != null)
            return false;
        user.setActive(true);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.getRoles().add(Role.ROLE_USER);
        log.info("saving new user with email: {}", email);
        return true;

    }
}
