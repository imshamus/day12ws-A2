package sg.edu.nus.iss.day12ws_A2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("/numbers")
public class NumberController 
{
    @GetMapping("")
    public String showForm() {
        return "numberForm";
    }

    @PostMapping("")
    public String postInput(@ModelAttribute("number") Integer number, BindingResult bindingResult, Model model)
    {
        return "redirect:/generated"; // to repopulate the html page
    }
    
}
