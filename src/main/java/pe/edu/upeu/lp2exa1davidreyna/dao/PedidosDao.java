package pe.edu.upeu.lp2exa1davidreyna.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.lp2exa1davidreyna.entity.Pedidos;

public interface PedidosDao {
	int create(Pedidos pe);
	int update(Pedidos pe);
	int delete(int id);
	Map<String, Object> read(int id);
	List<Map<String, Object>>readAll();
}
