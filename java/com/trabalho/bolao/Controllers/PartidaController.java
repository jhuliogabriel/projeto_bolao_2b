
package com.trabalho.bolao.Controllers;
import com.trabalho.bolao.Models.PartidaModel;
import com.trabalho.bolao.Models.PartidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class PartidaController {
    @Autowired
    PartidaRepository repo;

    @GetMapping(value = "/partidas")
    public String getPartidas(Model model){

        model.addAttribute("page", "partidas");
        model.addAttribute("partidas", repo.findAll());

        return "index";
    }

    @PostMapping(value = "/addpartida")
    public String addPartida(PartidaModel partida, Model model, BindingResult result){

        if(result.hasErrors()){
            return "/partidas";
        }

        repo.save(partida);

        return "/partidas";

    }
}
