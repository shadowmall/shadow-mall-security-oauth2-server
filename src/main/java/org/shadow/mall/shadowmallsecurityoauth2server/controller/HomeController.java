package org.shadow.mall.shadowmallsecurityoauth2server.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@GetMapping("/")
    public String home(){
        return "a simple anthorization server based spring security oauth2";
    }
	
	@GetMapping("/me")
    @ResponseBody
    public Principal user(Principal principal) {
         return principal;
    }

}
