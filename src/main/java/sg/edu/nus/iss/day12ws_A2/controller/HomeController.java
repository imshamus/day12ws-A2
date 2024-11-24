package sg.edu.nus.iss.day12ws_A2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("") // Without anything will auto show index.html at http://localhost:8080/
public class HomeController {

    @GetMapping(path = {"", "/home"}, produces = {"text/html"}) 
    public String home() {
        return "home"; // Returns home.html instead of index.html
    }

    // http://localhost:8080/check
    // http://localhost:8080/check?param=hello
    @ResponseBody // if no html must put @ResponseBody to display text if using @Controller
    @GetMapping("/check")
    public String checkPara(@RequestParam(required = false) String param) {
        if (param == null) {
            return "Parameter not provided";
        }
        return "Provided parameter: " + param;
    }  

    // Using a default
    // http://localhost:8080/def gives parameter:default
    @ResponseBody
    @GetMapping("/def")
    public String showDefault(@RequestParam(defaultValue = "default") String param) {
        return "Parameter: " + param;
    }

    
}
