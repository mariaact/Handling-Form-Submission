package org.mcalvot.formacion.HandlingFormSubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class SaludoController {

    @GetMapping("/informacion")
    public String SaludoForm(Model model){

        model.addAttribute("info", new Saludo());
        return "saludo";
    }

    @PostMapping("/informacion")
    public String SaludoSubmit(@ModelAttribute Saludo saludo, Model model){

        model.addAttribute("info", saludo);

        return "resultado";
    }
}
