package pe.edu.upeu.lp2exa1davidreyna.service;

import java.util.Map;
import pe.edu.upeu.lp2exa1davidreyna.entity.Usuario;
import java.util.List;

public interface UsuarioService {
	int create(Usuario u);
	int update(Usuario u);
	int delete(int id);
	Map<String, Object> read(int id);
	List<Map<String, Object>>readAll();
	
}

