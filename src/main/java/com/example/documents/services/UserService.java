package com.example.documents.services;

import com.example.documents.exceptions.UserAlreadyExistsException;
import com.example.documents.models.User;
import com.example.documents.modelsDTO.UserDtoPost;
import com.example.documents.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    public Long addUser(UserDtoPost userDto) {
        Optional<User> optionalUser = userRepository.findByEmail(userDto.email());

        if (optionalUser.isPresent()) {
            throw new UserAlreadyExistsException("This email is already taken", HttpStatus.BAD_REQUEST);
        }

        return userRepository.save(mapToUser(userDto)).getId();
    }

    public Long updateUser(User user) {
        return userRepository.save(user).getId();
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    private User mapToUser(UserDtoPost userDto) {
        var user = new User();
        user.setJobTitle(userDto.jobTitle());
        user.setSubdivision(userDto.subdivision());
        user.setFullName(userDto.fullName());
        user.setEmail(userDto.email());
        user.setPassword(userDto.password());

        return user;
    }
}
