package db_1;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class jdbcDao {
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<User> selectAll(){
		String sql="select * from member";
		UserRowMapper mapper = new UserRowMapper();
		List<User> member = jdbcTemplate.query(sql, mapper);
		return member;
	}

}
