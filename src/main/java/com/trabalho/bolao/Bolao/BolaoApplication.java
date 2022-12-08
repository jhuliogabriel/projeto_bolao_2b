package com.trabalho.bolao.Bolao;

import com.trabalho.bolao.Controllers.AuthController;
import com.trabalho.bolao.Controllers.SelecaoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({SelecaoController.class, AuthController.class})
public class BolaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BolaoApplication.class, args);
	}

}