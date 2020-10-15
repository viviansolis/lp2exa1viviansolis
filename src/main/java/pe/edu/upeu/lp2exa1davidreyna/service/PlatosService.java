package pe.edu.upeu.lp2exa1davidreyna.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.lp2exa1davidreyna.entity.Platos;

public interface PlatosService {
	int create(Platos pl);
	int update(Platos pl);
	int delete(int id);
	Map<String, Object> read(int id);
	List<Map<String, Object>>readAll();
}
