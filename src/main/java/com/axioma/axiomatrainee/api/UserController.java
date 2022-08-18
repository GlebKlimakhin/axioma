package com.axioma.axiomatrainee.api;

import com.axioma.axiomatrainee.model.User;
import com.axioma.axiomatrainee.requestdto.SaveUserRequestDto;
import com.axioma.axiomatrainee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
//    @PreAuthorize("hasAuthority('user')")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        User found = userService.findById(id);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Methods", "GET, POST, OPTIONS");
        headers.add("Access-Control-Allow-Headers", "Content-Type, Authorization");
        return ResponseEntity.ok()
                .headers(headers)
                .body(found);
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
