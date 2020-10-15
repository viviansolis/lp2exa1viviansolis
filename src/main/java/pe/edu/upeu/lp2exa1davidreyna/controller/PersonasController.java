package pe.edu.upeu.lp2exa1davidreyna.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.lp2exa1davidreyna.entity.Personas;
import pe.edu.upeu.lp2exa1davidreyna.service.PersonasService;



@RestController
@RequestMapping("/personas")

public class PersonasController {
	@Autowired
	private PersonasService personasService;
	@GetMapping("/lista")
	public List<Map<String, Object>> lista() {
		return personasService.readAll();
	}

	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return personasService.read(id);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return personasService.delete(id);
		
	}	
	@PostMapping("/create")
	public int create(@RequestBody Personas p) {
		return personasService.create(p);	
		
	}		
	@PutMapping("/update/{id}")
    public int update(@RequestBody Personas p,@PathVariable int id) {
		p.setIdpersonas(id);
		
	return personasService.update(p);
	}
}
