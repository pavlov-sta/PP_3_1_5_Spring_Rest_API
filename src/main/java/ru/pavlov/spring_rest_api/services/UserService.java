package ru.pavlov.spring_rest_api.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.pavlov.spring_rest_api.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void add(User user);

    User findByLogin(String login);

    List<User> getAllUsers();

    void removeUser(int id);

    User getUser(int id);
}
