package io.ankburov.vuespring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/api/users")
    public List<User> getUsers() {
        return Arrays.asList(new User(1, "username"));
    }
}
