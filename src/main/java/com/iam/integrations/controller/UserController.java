package com.iam.integrations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;

@RestController
public class UserController {

    @GetMapping("/user")
    public String user(@AuthenticationPrincipal OidcUser user) {
        return "Hello, " + user.getFullName();
    }
}
