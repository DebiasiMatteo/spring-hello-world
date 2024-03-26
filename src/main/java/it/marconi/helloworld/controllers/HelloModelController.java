package main.java.it.marconi.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("other")
public class HelloModelController {

    @GetMapping("fixed")
    public ModelAndView greetAttribute(){
        
        return new ModelAndView("hello-world-model").addObject("name", "The Rock");
    }
}