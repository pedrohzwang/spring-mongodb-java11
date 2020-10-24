package com.phnzwang.springbootapp.resources;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import com.phnzwang.springbootapp.domains.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")

public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User maria = new User("1", "Maria", "maria@gmail.com");
        User max = new User("2", "Max", "max@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, max));
        return ResponseEntity.ok().body(list);
    }


}
