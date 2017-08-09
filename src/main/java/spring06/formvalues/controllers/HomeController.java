package spring06.formvalues.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @RequestMapping("/songform")
    public String loadFormPage(Model model){
        model.addAttribute("song", new Song());
        return "songform";
    }
    @PostMapping ("/songform")
    public String loadFromPage(@Valid @ModelAttribute Song song, BindingResult bindingResult) {

        if(bindingResult.hasErrors())
        {
            return "songform";
        }
        return "confirmsong";
    }
}
