package vn.thi14.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.thi14.laptopshop.domain.User;
import vn.thi14.laptopshop.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        return this.userRepository.findAll();
    }

    public List<User> getAllUsersByEmail(String email){
        return this.userRepository.findByEmail(email);
    }

    public User getUserById(long id){
        return this.userRepository.findById(id);
    }

    public User handleSaveUser(User user){
        return this.userRepository.save(user);
    }

    public void deleteAUser(long id){
        this.userRepository.deleteById(id);
    }
}


