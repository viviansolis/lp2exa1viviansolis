package pe.edu.upeu.lp2exa1davidreyna.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lp2exa1davidreyna.dao.PersonasDao;
import pe.edu.upeu.lp2exa1davidreyna.entity.Personas;
import pe.edu.upeu.lp2exa1davidreyna.service.PersonasService;


@Service

public class PersonaServiceImpl implements PersonasService{

	@Autowired
	private PersonasDao personasdao;
	
	@Override
	public int create(Personas p) {
		// TODO Auto-generated method stub
		return personasdao.create(p);
	}

	@Override
	public int update(Personas p) {
		// TODO Auto-generated method stub
		return personasdao.update(p);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return personasdao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id){
		// TODO Auto-generated method stub
		return personasdao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return personasdao.readAll();
	}
	
}

