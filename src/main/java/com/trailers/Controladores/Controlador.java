package com.trailers.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trailers.Modelos.Cliente;
import com.trailers.Modelos.Persona;
import com.trailers.Repositorios.RepoCliente;

@Controller
@RequestMapping("/")
public class Controlador {
	
	@Autowired
	private RepoCliente repoCliente;

	@GetMapping( value = "a")
	public String ListarClientes( Model model) {
		List<Cliente> clientes = repoCliente.findAll();
		model.addAttribute("clientes", clientes);
		return "mostrarClientes";
	}
	
	@GetMapping( value = "b")
	public String MstrarForm(Model model) {
		model.addAttribute("p", new Cliente());
		return "form";
	}
	
	@PostMapping( value = "b")
	public String GuardarP(@Validated Cliente p,Model model) {
		repoCliente.save(p);
		return "redirect:/a";
	}
	
	
}
