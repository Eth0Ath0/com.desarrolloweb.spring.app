package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PerfilController {
	
	@GetMapping("perfil")
	public String perfil() {
		return "perfil";
		
	}

}
