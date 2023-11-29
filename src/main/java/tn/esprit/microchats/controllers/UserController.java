package tn.esprit.microchats.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.microchats.entities.User;
import tn.esprit.microchats.services.UserServiceImp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private UserServiceImp userServiceImp;



    //private String title ="hello,i'm the candidate micro service";

    @GetMapping("/hello")
    public String sayHello(){
        //System.out.println(title);
        return "hello,i'm the candidate micro service";

    }

    @PostMapping("/addUser")
    private User addUser(@RequestBody User u){
        return userServiceImp.addUser(u);
    }

    @PutMapping("/updateUser")
    private User updateUser(@RequestBody User u){
        return userServiceImp.updateUser(u);
    }

    @GetMapping("/findAllUsers")
    private List<User> findAllUsers(){
        return userServiceImp.findAllUsers();
    }

    @GetMapping("/findById/{idU}")
    private User findById(@PathVariable Integer idU){
        return userServiceImp.findById(idU);
    }
    @DeleteMapping("/deleteUser/{idU}")
    private void deleteUser(@PathVariable Integer idU){
        userServiceImp.deleteUser(idU);
    }
}
