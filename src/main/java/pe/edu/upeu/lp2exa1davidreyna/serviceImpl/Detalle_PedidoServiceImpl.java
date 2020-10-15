package pe.edu.upeu.lp2exa1davidreyna.serviceImpl;

import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.lp2exa1davidreyna.dao.Detalle_PedidoDao;
import pe.edu.upeu.lp2exa1davidreyna.entity.Detalle_Pedido;
import pe.edu.upeu.lp2exa1davidreyna.service.Detalle_PedidoService;
@Service
public class Detalle_PedidoServiceImpl implements Detalle_PedidoService{
	@Autowired
	private Detalle_PedidoDao detalle_PedidoDao;
	@Override
	public int create(Detalle_Pedido dp) {
		// TODO Auto-generated method stub
		return detalle_PedidoDao.create(dp);
	}

	@Override
	public int update(Detalle_Pedido dp) {
		// TODO Auto-generated method stub
		return detalle_PedidoDao.update(dp);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return detalle_PedidoDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return detalle_PedidoDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detalle_PedidoDao.readAll();
	}

}
