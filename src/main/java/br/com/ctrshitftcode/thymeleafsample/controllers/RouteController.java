package br.com.ctrshitftcode.thymeleafsample.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RouteController {

    private static final String PAGE = "index";
    @GetMapping("/")
    public String routeIndex(Model model){
        model.addAttribute("message", "Welcome the thymeleaf Template");
        return PAGE;
    }

    @GetMapping("/data")
    public String routeData(@RequestParam(name = "message", required = true, defaultValue = "x") String message, Model model ){
        model.addAttribute("message", message);
        return PAGE;
    }

}
