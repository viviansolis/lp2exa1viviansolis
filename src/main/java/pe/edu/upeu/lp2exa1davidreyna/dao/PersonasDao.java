package pe.edu.upeu.lp2exa1davidreyna.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.lp2exa1davidreyna.entity.Personas;

public interface PersonasDao {
	int create(Personas p);
	int update(Personas p);
	int delete(int id);
	Map<String, Object> read(int id);
	List<Map<String, Object>>readAll();
}
