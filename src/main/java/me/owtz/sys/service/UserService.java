package me.owtz.sys.service;

import me.owtz.sys.domain.models.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);

    Boolean existsByAccountNumber(String number);
}
