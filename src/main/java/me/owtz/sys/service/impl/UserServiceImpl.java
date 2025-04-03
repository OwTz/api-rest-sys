package me.owtz.sys.service.impl;

import me.owtz.sys.domain.models.User;
import me.owtz.sys.domain.repository.QueryUser;
import me.owtz.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final QueryUser userRepository;

    public UserServiceImpl(QueryUser userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
       return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (existsByAccountNumber(userToCreate.getAccount().getNumber()) || userToCreate.getId().equals(userRepository.findById(userToCreate.getId()))) {
            throw new IllegalArgumentException("This Account already Exists");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    public Boolean existsByAccountNumber(String number) {
        for (User u: userRepository.findAll()){
            if (u.getAccount().equals(number)){
                    return true;
                }
            }
        return false;
    }
}
