package com.example.binsstory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class test {

    private final UserRepository userRepository;

    @Autowired
    public test(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/testpage")
    public String test (){
        return "test";
    }


    @GetMapping("testpage2")
    public List<user> list() {
        return userRepository.findAll();
    }
}
