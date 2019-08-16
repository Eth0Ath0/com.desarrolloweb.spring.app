package com.desarrolloweb.spring.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.desarrolloweb.spring.app.model.Usuario;

@Controller
@RequestMapping("/app")
public class HolaMundoController {
	
		@GetMapping({"/index","/","/home"}) //podemos definir varias rutas
	
		public String HolaMundo() {
		return"index";
		
    }
	
	@RequestMapping(value="/perfil",method =RequestMethod.GET)
	
	public String perfil(Model model) {
		
	Usuario usuario= new Usuario();
		usuario.setNombre("Luise");
	usuario.setApellido("Estrada");
	model.addAttribute("titulo", "perfil de:  ".concat(usuario.getNombre()));
	model.addAttribute("usuario",usuario);
	return "perfil";
	
	}
	
	
}	


//@RequestMapping(value="/index",method = RequestMethod.GET) especificamos ruta solo para una ruta


	/*
	@GetMapping({"/perfil"})
	public String perfil() {
	
	return "perfil";
	}*/
                
                /*@RequestMapping(value="/perfil",method=RequestMethod.GET)
                
	public String Perfil(ModelMap model) {
            model.addAttribute("Nombre", "Luis Enrique Estrada");
		return "perfil";
	}*/


