package org.example.chapter7.controller;

import org.example.chapter7.service.LoggedUserManagementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

//    @RequestMapping("/home")
//    public String home() {
//        return "home.html";
//    }

//    @RequestMapping("/home")
//    public String home(Model page){
//        page.addAttribute("username", "Victor");
//        page.addAttribute("color", "red");
//        return "home.html";
//    }

    //Request parameter
//
//    @RequestMapping("/home")
//    public String home(
//            @RequestParam String color,
//            Model page) {
//        page.addAttribute("username", "Victor");
//        page.addAttribute("color", color);
//        return "home.html";
//    }
//    @RequestMapping("/home")
//    public String home(
//            @RequestParam(required = false) String name,
//            @RequestParam(required = false) String color,
//            Model page) {
//        page.addAttribute("username", name);
//        page.addAttribute("color", color);
//        return "home.html";
//    }

//    @RequestMapping("/home/{color}")
//    public String home(
//        @PathVariable String color,
//        Model page
//    ){
//        page.addAttribute("username", "Socata1");
//        page.addAttribute("color", color);
//        return  "home.html";
//    }

    private final LoggedUserManagementService loggedUserManagementService;

    public MainController(
            LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    @GetMapping("/main")
    public String home(
            @RequestParam(required = false) String logout,
            Model model
    ) {
        if (logout != null) {
            loggedUserManagementService.setUsername(null);
        }

        String username = loggedUserManagementService.getUsername();

        if (username == null) {
            return "redirect:/";
        }

        model.addAttribute("username" , username);
        return "main.html";
    }

}
