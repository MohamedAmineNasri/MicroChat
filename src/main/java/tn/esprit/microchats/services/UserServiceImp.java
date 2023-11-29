package tn.esprit.microchats.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.microchats.entities.User;
import tn.esprit.microchats.repositories.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImp implements IUser{
    private UserRepository userRepository;
    @Override
    public User addUser(User u) {
        return userRepository.save(u);
    }

    @Override
    public User updateUser(User u) {
        return userRepository.save(u);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer idU) {
        return  userRepository.findById(idU).orElse(null);
    }

    @Override
    public void deleteUser(Integer idU) {
        userRepository.deleteById(idU);
    }
}

