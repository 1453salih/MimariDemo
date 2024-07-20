package ders_video.mimaridemo.controller;

import ders_video.mimaridemo.dto.User;
import ders_video.mimaridemo.service.UserService;
import ders_video.mimaridemo.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {


    private UserService userService = new UserServiceImpl();

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable("userId") Long userId){
        return userService.getByUser(userId);
    }

}
