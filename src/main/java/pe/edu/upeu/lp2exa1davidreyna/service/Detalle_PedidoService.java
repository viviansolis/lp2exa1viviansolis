package pe.edu.upeu.lp2exa1davidreyna.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.lp2exa1davidreyna.entity.Detalle_Pedido;

public interface Detalle_PedidoService {
	int create(Detalle_Pedido dp);
	int update(Detalle_Pedido dp);
	int delete(int id);
	Map<String, Object> read(int id);
	List<Map<String, Object>>readAll();
}
