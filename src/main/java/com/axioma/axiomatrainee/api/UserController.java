package com.axioma.axiomatrainee.api;

import com.axioma.axiomatrainee.model.User;
import com.axioma.axiomatrainee.requestdto.SaveUserRequestDto;
import com.axioma.axiomatrainee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/")
    public User save(@RequestBody SaveUserRequestDto request) {
        return userService.save(request);
    }

    @DeleteMapping("/")
    public void deleteById(@PathVariable Long id) {
        userService.delete(id);
    }


}
