package sg.edu.nus.iss.day12ws_A2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import sg.edu.nus.iss.day12ws_A2.model.NumInput;
import sg.edu.nus.iss.day12ws_A2.service.NumService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/randoms")
public class NumberController 
{
    @Autowired 
    private NumService numService;

    // Part 1: Show form (Binding the form to a model, slide 12)
    @GetMapping("")
    public String showForm(Model model) 
    {
        model.addAttribute("numInput", new NumInput()); // Give an empty NumInput object to the form.
        return "numberForm"; // Go to the "numberForm.html" page.
    }

    // Part 2: Handle form submission
    @PostMapping("")
    public String postInput(@Valid @ModelAttribute("numInput") NumInput numInput, BindingResult bindingResult, Model model)
    {
        if (bindingResult.hasErrors())
        {
            return "numberForm"; // Go back to the form if there are errors.
        }

        // Generate random numbers and add them to the page
        model.addAttribute("randomNumbers", numService.generateNumbers(numInput.getValue())); // the model adds a set of numbers

        return "generated"; // Go to the "generated.html" page.
    }
    
}
