package com.likelion.threetier.user.repository;

import com.likelion.threetier.user.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users;

    @PostConstruct
    public void exampleUsers() {
        users = new ArrayList<>();
        users.add(new User(1, "Hoang", LocalDate.of(2001, 10, 22), "lehoang", "123123"));
        users.add(new User(2, "Phat", LocalDate.of(2001, 10, 22), "lehoang", "123123"));
        users.add(new User(3, "Thai", LocalDate.of(2001, 10, 22), "lehoang", "123123"));
        users.add(new User(4, "Truong", LocalDate.of(2001, 10, 22), "lehoang", "123123"));
    }

    public List<User> findAll() {
        return users;
    }

}
