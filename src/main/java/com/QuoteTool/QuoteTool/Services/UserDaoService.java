package com.QuoteTool.QuoteTool.Services;

import com.QuoteTool.QuoteTool.Models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserDaoService implements Dao<User> {

    private List<User> users = new ArrayList<>();

    public UserDaoService() {
        users.add(new User("John", "john@domain.com"));
        users.add(new User("Susan", "susan@domain.com"));
    }

    @Override
    public Optional<User> get(long id) {
        return Optional.ofNullable(users.get((int) id));
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update(User user, String[] params) {
        user.setCompanyName(Objects.requireNonNull(
                params[0], "Name cannot be null"));
        user.setEmail(Objects.requireNonNull(
                params[1], "Email cannot be null"));

        users.add(user);
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }
}