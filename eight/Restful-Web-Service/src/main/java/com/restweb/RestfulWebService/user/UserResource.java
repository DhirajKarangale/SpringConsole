package com.restweb.RestfulWebService.user;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource 
{
    private UserDaoService service;

    public UserResource(UserDaoService service)
    {
        this.service = service;
    }

    @GetMapping("users")
    public List<User> RetriveAllUsers()
    {
        return service.FindAll();
    }

    @GetMapping("users/{id}")
    public User RetriveUsers(@PathVariable int id)
    {
        User user = service.FindUser(id);
        if(user == null) throw new UserNotFoundExpection("id:" +id);
        return user; 
    }

    @PostMapping("users")
    public ResponseEntity<User> CreateUsers(@RequestBody User user)
    {
        User savedUser = service.SaveUser(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}