package pe.edu.upeu.lp2exa1davidreyna.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lp2exa1davidreyna.dao.PedidosDao;
import pe.edu.upeu.lp2exa1davidreyna.entity.Pedidos;
import pe.edu.upeu.lp2exa1davidreyna.service.PedidosService;

@Service

public class PedidosServiceImpl implements PedidosService{

	@Autowired
	private PedidosDao pedidosdao;
	
	@Override
	public int create(Pedidos pe) {
		// TODO Auto-generated method stub
		return pedidosdao.create(pe);
	}

	@Override
	public int update(Pedidos pe) {
		// TODO Auto-generated method stub
		return pedidosdao.update(pe);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return pedidosdao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id){
		// TODO Auto-generated method stub
		return pedidosdao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return pedidosdao.readAll();
	}
	
}
