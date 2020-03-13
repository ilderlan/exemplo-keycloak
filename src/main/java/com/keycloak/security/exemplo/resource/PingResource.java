package com.keycloak.security.exemplo.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ping")
public class PingResource {
    @GetMapping
    public String ping(){
        return "home";
    }
}
