package com.example.mypetproject.service.user;

import com.example.mypetproject.dto.UserInfo;
import com.example.mypetproject.model.User;
import com.example.mypetproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public User createUser(UserInfo userInfo) {
        User user = new User();
        user.setUser(userInfo);
        userRepository.save(user);
        return user;
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.getById(userId);
    }

    @Override
    public User getUserByName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public Boolean findUserByName(String userName) {
        User userFromDB = userRepository.findByUserName(userName);
        return userFromDB == null;
    }

    @Override
    public Boolean findUserByMail(String userMail) {
        User userFormBD = userRepository.findByUserMail(userMail);
        return userFormBD == null;
    }

    @Override
    public Boolean checkBalance(Long userId, Long cost) {
        User user = userRepository.getById(userId);
        Long balance = user.getUserBalance();
        return balance > cost;
    }

    @Override
    public Boolean checkUserPassword(User user, String password) {
        return user.getUserPassword().equals(password);
    }
}
