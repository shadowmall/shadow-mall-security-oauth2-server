package org.shadow.mall.shadowmallsecurityoauth2server.controller;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
	
	@GetMapping("/")
    public String home(){
        return "a simple anthorization server based spring security oauth2";
    }
	
	@GetMapping("/user/me")
    @ResponseBody
    public Principal user(Principal principal) {
         return principal;
    }

}
