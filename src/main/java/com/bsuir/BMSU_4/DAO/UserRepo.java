package com.bsuir.BMSU_4.DAO;

import com.bsuir.BMSU_4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
