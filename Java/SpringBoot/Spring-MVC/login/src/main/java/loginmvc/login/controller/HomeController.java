package loginmvc.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{


    @RequestMapping("/index")
    public String hello(){
        return "index";
    }

    @RequestMapping("/thymeleaf")
    public String thyme(Model model){
        model.addAllAttributes("User", new loginmvc.model.Usuario());
        return "thyme";
    }

}