package pe.edu.upeu.lp2exa1davidreyna.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2exa1davidreyna.dao.Detalle_PedidoDao;
import pe.edu.upeu.lp2exa1davidreyna.entity.Detalle_Pedido;

@Repository
public class Detalle_PedidoDaoImpl implements Detalle_PedidoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Detalle_Pedido dp) {
		// TODO Auto-generated method stub
		String SQL = "insert into detalle_pedido(iddetalle_pedido,precio,cantidad,idplatos,idpedidos) values(?,?,?,?,?)";
		return jdbcTemplate.update(SQL,
				dp.getIddetalle_pedido(),
				dp.getPrecio(),
				dp.getCantidad(),
				dp.getIdplatos(),
				dp.getIdpedidos());
	}

	@Override
	public int update(Detalle_Pedido dp) {
		// TODO Auto-generated method stub
		String SQL = "update detalle_pedido set precio=?, cantidad=?  where idplato=?,idpedidos=?";
		return jdbcTemplate.update(SQL,dp.getPrecio(),dp.getCantidad(),dp.getIdplatos(),dp.getIdpedidos());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from detalle_pedidos where iddetalle_pedido=?";
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from detalle_pedido where iddetalle_pedidos=?";
		return jdbcTemplate.queryForMap(SQL, id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select *from detalle_pedido";
		return jdbcTemplate.queryForList(SQL);
	}

}
