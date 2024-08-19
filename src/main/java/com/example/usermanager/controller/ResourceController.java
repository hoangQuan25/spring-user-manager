package com.example.usermanager.controller;

import com.example.usermanager.exception.UnauthorizedException;
import com.example.usermanager.model.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @GetMapping("/unauthorizedException")
    public String unauthorizedAccess() {
        throw new UnauthorizedException("User not logged in");
    }
}
