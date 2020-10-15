package pe.edu.upeu.lp2exa1davidreyna.dao;

import java.util.Map;

import pe.edu.upeu.lp2exa1davidreyna.entity.Usuario;

import java.util.List;

public interface UsuarioDao {

	int create(Usuario u);
	int update(Usuario u);
	int delete(int id);
	Map<String,Object> read(int id);
	List<Map<String,Object>>readAll();
	public Usuario read(String nomuser);
}

