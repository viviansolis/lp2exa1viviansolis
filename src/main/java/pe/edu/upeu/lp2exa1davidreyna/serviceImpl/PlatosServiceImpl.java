package pe.edu.upeu.lp2exa1davidreyna.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lp2exa1davidreyna.dao.PlatosDao;
import pe.edu.upeu.lp2exa1davidreyna.entity.Platos;
import pe.edu.upeu.lp2exa1davidreyna.service.PlatosService;

@Service

public class PlatosServiceImpl implements PlatosService{
	@Autowired
	private PlatosDao platosdao;
	
	@Override
	public int create(Platos pl) {
		// TODO Auto-generated method stub
		return platosdao.create(pl);
	}

	@Override
	public int update(Platos pl) {
		// TODO Auto-generated method stub
		return platosdao.update(pl);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return platosdao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return platosdao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return platosdao.readAll();
	}

	
	
}
