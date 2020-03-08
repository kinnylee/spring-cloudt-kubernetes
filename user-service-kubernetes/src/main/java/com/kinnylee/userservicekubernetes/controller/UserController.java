package com.kinnylee.userservicekubernetes.controller;

import com.kinnylee.userservicekubernetes.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api/user")
@RestController
public class UserController {

    private List<User> users = new ArrayList<>();

    @GetMapping("/list")
    public List userList() {
        return users;
    }

    @PostMapping("/add")
    public String add(@RequestParam(name = "name") String name) {
        User user = new User();
        user.setId(users.size());
        user.setName(name);
        users.add(user);
        return "ok";
    }

}
