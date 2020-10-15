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

import pe.edu.upeu.lp2exa1davidreyna.entity.Platos;
import pe.edu.upeu.lp2exa1davidreyna.service.PlatosService;

@RestController
@RequestMapping("/platos")
public class PlatosController {
	
	@Autowired
	private PlatosService platosService;
	@GetMapping("/lista")
	public List<Map<String, Object>> lista() {
		return platosService.readAll();
	}

	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return platosService.read(id);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return platosService.delete(id);
		
	}	
	@PostMapping("/create")
	public int create(@RequestBody Platos pl) {
		return platosService.create(pl);	
		
	}		
	@PutMapping("/update/{id}")
    public int update(@RequestBody Platos pl,@PathVariable int id) {
		pl.setIdplatos(id);
		
	return platosService.update(pl);
	}
}
