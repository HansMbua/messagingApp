package io.javabrains.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;

// user this controller to detect if user is login or not
@Controller
public class inboxController {

    @GetMapping(value = "/")
//    @AuthenticationPrincipal has the login users information
    public String homePage(@AuthenticationPrincipal OAuth2User principal){

        if (principal == null || !StringUtils.hasText(principal.getAttribute("name"))){
            return "index";
        }else {
            return "inbox-page";
        }

    }

}
