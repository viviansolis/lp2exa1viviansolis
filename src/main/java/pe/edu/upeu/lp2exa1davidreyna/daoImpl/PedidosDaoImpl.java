package pe.edu.upeu.lp2exa1davidreyna.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2exa1davidreyna.dao.PedidosDao;
import pe.edu.upeu.lp2exa1davidreyna.entity.Pedidos;

@Repository
public class PedidosDaoImpl implements PedidosDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Pedidos pe) {
		// TODO Auto-generated method stub
		String SQL = "insert into pedidos(idpedidos,fecha,direccion_entrega,idusuario) values(?,?,?,?)";
		return jdbcTemplate.update(SQL,
				pe.getIdpedidos(),
				pe.getFecha(),
				pe.getDireccion_entrega(),
				pe.getIdusuario());
	}

	@Override
	public int update(Pedidos pe) {
		// TODO Auto-generated method stub
		String SQL = "update pedidos set fecha=?, dirreccion_entrega=? where idusuario=?";
		return jdbcTemplate.update(SQL,pe.getFecha(),pe.getDireccion_entrega(),pe.getIdusuario());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from pedidos where idpedido=?";
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from pedidos where idpedidos=?";
		return jdbcTemplate.queryForMap(SQL, id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select *from pedido";
		return jdbcTemplate.queryForList(SQL);
	}
}
