package com.cydeo.service.impl;

import com.cydeo.DTO.UserDTO;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends AbstractMapService<UserDTO, String> implements UserService {
    @Override
    public UserDTO save(UserDTO userName) {
        return super.save(userName.getUserName(), userName);
    }

    @Override
    public void update(UserDTO userName) {
        super.update(userName.getUserName(), userName);
    }

    @Override
    public UserDTO findById(String userName) {
        return super.findById(userName);
    }

    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String userName) {
        super.deleteById(userName);
    }
}
