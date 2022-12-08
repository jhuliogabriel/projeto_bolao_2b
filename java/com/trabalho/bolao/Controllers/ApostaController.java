
package com.trabalho.bolao.Controllers;

import com.trabalho.bolao.Models.ApostaModel;
import com.trabalho.bolao.Models.ApostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class ApostaController {
	
    @Autowired
    ApostaRepository repo;

    @GetMapping(value = "/apostas")
    public String getApostas(Model model){

        model.addAttribute("page", "apostas");
        model.addAttribute("apostas", repo.findAll());

        return "index";
    }

    @PostMapping(value = "/addaposta")
    public String addSelecao(ApostaModel aposta, Model model, BindingResult result){

        if(result.hasErrors()){
            return "/apostas";
        }

        repo.save(aposta);

        return "/apostas";

    }
}
