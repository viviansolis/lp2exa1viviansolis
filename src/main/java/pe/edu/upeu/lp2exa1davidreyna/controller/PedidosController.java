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

import pe.edu.upeu.lp2exa1davidreyna.entity.Pedidos;
import pe.edu.upeu.lp2exa1davidreyna.service.PedidosService;

@RestController
@RequestMapping("/pedidos")

public class PedidosController {
	@Autowired
	private PedidosService pedidosService;
	@GetMapping("/lista")
	public List<Map<String, Object>> lista() {
		return pedidosService.readAll();
	}

	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return pedidosService.read(id);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return pedidosService.delete(id);
		
	}	
	@PostMapping("/create")
	public int create(@RequestBody Pedidos pe) {
		return pedidosService.create(pe);	
		
	}		
	@PutMapping("/update/{id}")
    public int update(@RequestBody Pedidos pe,@PathVariable int id) {
		pe.setIdpedidos(id);
		
	return pedidosService.update(pe);
	}
}
