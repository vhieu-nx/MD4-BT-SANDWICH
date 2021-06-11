package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {
    @GetMapping("/sandwich")
    public ModelAndView showForm(){
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }
    @PostMapping("/sandwich")
    public ModelAndView save(@RequestParam ("condiment") String[] condiment){
        ModelAndView modelAndView = new ModelAndView("home");
        String result = "";
        for (String s:
             condiment) {
            result +=s + " ";
        }
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
