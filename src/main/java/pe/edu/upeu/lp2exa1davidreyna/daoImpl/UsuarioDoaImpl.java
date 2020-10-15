package pe.edu.upeu.lp2exa1davidreyna.daoImpl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2exa1davidreyna.dao.UsuarioDao;
import pe.edu.upeu.lp2exa1davidreyna.entity.Usuario;


@Repository
public class UsuarioDoaImpl implements UsuarioDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		String SQL = "insert into usuario(idusuario,nomuser,clave,idpersonas) values(?,?,?,?,?)";
		return jdbcTemplate.update(SQL,u.getIdusuario(),u.getNomuser(),u.getClave(),u.getIdpersonas());
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		String SQL = "update usuario set nomuser=?,clave=? where idpersona=?";
		return jdbcTemplate.update(SQL, u.getNomuser(), u.getClave(),u.getIdpersonas());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from usuario where idusuario=?";
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from usuario where idusuario=?";
		return jdbcTemplate.queryForMap(SQL, id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select *from usuario";
		return jdbcTemplate.queryForList(SQL);
	}

	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
		String SQL = "select *from usuario where nomuser=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}
	
	
}
