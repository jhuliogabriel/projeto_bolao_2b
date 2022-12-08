
package com.trabalho.bolao.Controllers;

import com.trabalho.bolao.Models.UsuarioModel;
import com.trabalho.bolao.Models.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AuthController {
    
    private boolean isAuthenticated;
    private UsuarioModel usuario;
    private String titulo;
    
    @Autowired
    UsuarioRepository usuarioRepo;
    

    public AuthController() {
        this.isAuthenticated = false;
        this.titulo = "Bolão da Copa";
    }
    
    
    @GetMapping(value = "/login")
    public String login(Model model){
        
        model.addAttribute("titulo", this.titulo);
        
        this.isAuthenticated = true;
        if(isAuthenticated){
            return "index";
        }
        else{
           return "login"; 
        }
    }
    
    @PostMapping(value = "/index")
    public String autenticar(Model model){
        return "";
    }
    
    @GetMapping(value = "/register")
    public String register(UsuarioModel usuarioModel){
        return "register";
    }
    
    @PostMapping(value = "/adduser")
    public String registerUser(@Validated UsuarioModel user, BindingResult result, Model model){
        if(result.hasErrors()){
            return "redirect:/register";
        }
        usuarioRepo.save(user);
        return "redirect:/login";
    }
    
    @GetMapping(value = "/forgot-password")
    public String forgot_password(){
        if(this.isAuthenticated){
            return "index";
        }else{
            return "forgot-password";
        }
    }
    
    @GetMapping(value = "/index")
    public String index(Model model){
        if(this.isAuthenticated){
            model.addAttribute("page", "dashboard");
            return "index";
        }else{
            return "login";
        }
    }
    
    @GetMapping(value = "/logout")
    public String logout(Model model){
        model.addAttribute("titulo", this.titulo);
        this.isAuthenticated = false;
        return "login";
    }
}
