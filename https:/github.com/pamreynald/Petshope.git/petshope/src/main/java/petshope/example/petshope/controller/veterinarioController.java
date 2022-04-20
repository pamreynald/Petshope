package petshope.example.petshope.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import petshope.example.petshope.Veterinario;

@Controller
public class veterinarioController {
	@GetMapping("/cadastrarVeterinario")
	public String formCadastrarVeterinario(Model model) {
		Veterinario veterinario = new Veterinario();
		model.addAttribute("veterinario", veterinario);	
		return "cadastrarVeterinario"; 
	}
	ArrayList<Musica> lista = new ArrayList<>();
	
	Veterinario veterinario1 = new Veterinario("v1","Paulo Jefferson","");
	Veterinario veterinario2 = new Veterinario("m2","2m40s","estilo1");

	lista.add(musica1);
	lista.add(musica2);
	
	lista.add(musica);
	
	model.addAttribute("lista", lista);
	return "relatorio";
}
