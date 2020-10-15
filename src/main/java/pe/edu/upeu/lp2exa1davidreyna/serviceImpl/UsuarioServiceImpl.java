package pe.edu.upeu.lp2exa1davidreyna.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lp2exa1davidreyna.dao.UsuarioDao;
import pe.edu.upeu.lp2exa1davidreyna.entity.Usuario;
import pe.edu.upeu.lp2exa1davidreyna.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioDao usuariodao;
	
	@Override
	public int create(Usuario u ) {
		// TODO Auto-generated method stub
		return usuariodao.create(u);
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return usuariodao.update(u);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usuariodao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id){
		// TODO Auto-generated method stub
		return usuariodao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return usuariodao.readAll();
	}

	
}

