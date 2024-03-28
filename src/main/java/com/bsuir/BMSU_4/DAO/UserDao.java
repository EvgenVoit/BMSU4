package com.bsuir.BMSU_4.DAO;

import com.bsuir.BMSU_4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

    void deleteByEmail(String email);

    void deleteById(Integer id);

    User getUserByEmail(String email);

}
