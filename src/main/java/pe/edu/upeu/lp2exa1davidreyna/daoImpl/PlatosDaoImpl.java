package pe.edu.upeu.lp2exa1davidreyna.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2exa1davidreyna.dao.PlatosDao;
import pe.edu.upeu.lp2exa1davidreyna.entity.Platos;

@Repository
public class PlatosDaoImpl implements PlatosDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Platos pl) {
		// TODO Auto-generated method stub
		String SQL = "insert into platos (isplatos, nombre, precio, cantidad) values(?,?,?,?)";
		return jdbcTemplate.update(SQL,
				pl.getIdplatos(),
				pl.getNombre(),
				pl.getPrecio(),
				pl.getCantidad());
	}

	@Override
	public int update(Platos pl) {
		// TODO Auto-generated method stub
		String SQL = "update platos set nombre=?, precio=?,cantidad=? where idplatos=?";
		return jdbcTemplate.update(SQL,
				pl.getNombre(),
				pl.getPrecio(),
				pl.getCantidad(),
				pl.getIdplatos());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from platos where idplatos=?";
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from platos where idplatos=?";
		return jdbcTemplate.queryForMap(SQL, id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select *from platos";
		return jdbcTemplate.queryForList(SQL);
	}
	
}
