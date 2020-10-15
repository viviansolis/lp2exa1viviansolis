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

import pe.edu.upeu.lp2exa1davidreyna.entity.Detalle_Pedido;
import pe.edu.upeu.lp2exa1davidreyna.service.Detalle_PedidoService;

@RestController
@RequestMapping("/detalle_pedidos")
public class Detalle_pedidoController {
	@Autowired
	private Detalle_PedidoService detalle_PedidoService;
	
	@GetMapping("/lista")
	public List<Map<String, Object>> lista() {
		return detalle_PedidoService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return detalle_PedidoService.read(id);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return detalle_PedidoService.delete(id);
		
	}	
	@PostMapping("/create")
	public int create(@RequestBody Detalle_Pedido dp) {
		return detalle_PedidoService.create(dp);	
		
	}		
	@PutMapping("/update/{id}")
    public int update(@RequestBody Detalle_Pedido dp,@PathVariable int id) {
		dp.setIddetalle_pedido(id);
		
	return detalle_PedidoService.update(dp);
	}
}
