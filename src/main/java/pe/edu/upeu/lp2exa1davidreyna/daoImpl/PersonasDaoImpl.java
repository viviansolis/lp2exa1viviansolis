package pe.edu.upeu.lp2exa1davidreyna.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.lp2exa1davidreyna.dao.PersonasDao;
import pe.edu.upeu.lp2exa1davidreyna.entity.Personas;

@Repository

public class PersonasDaoImpl implements PersonasDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Personas p) {
		// TODO Auto-generated method stub
		String SQL = "insert into personas(idpersonas,nombres,correo,telefono) values(?,?,?,?)";
				  
		return jdbcTemplate.update(SQL,p.getIdpersonas(),p.getNombres(),p.getCorreo(),p.getTelefono()); 
}

	@Override
	public int update(Personas p) {
		// TODO Auto-generated method stub
		String SQL = "update personas set nombres=?,correo=?,telefono=? where idpersonas=?";
							
		return jdbcTemplate.update(SQL, 
										p.getNombres(), 
										p.getCorreo(),
										p.getTelefono(),
										p.getIdpersonas());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from personas where idpersonas=?";
		
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from personas where idpersonas=?";		
		return jdbcTemplate.queryForMap(SQL, id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select *from personas";
		return jdbcTemplate.queryForList(SQL);
	}
}
