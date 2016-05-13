package db_1;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class jdbcDao extends JdbcDaoSupport{
/*	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/
	
	public List<User> selectAll(){
		String sql="select * from member";
		UserRowMapper mapper = new UserRowMapper();
		//List<User> member = jdbcTemplate.query(sql, mapper);
		List<User> member = getJdbcTemplate().query(sql, mapper);
		return member;
	}
	
	public User selectOne(){
		String sql="select * from member where memberid=?";
		UserRowMapper mapper = new UserRowMapper();
		//User u = (User) jdbcTemplate.queryForObject(sql,new String []{"aa"}, mapper);
		User u = (User) getJdbcTemplate().queryForObject(sql,new String []{"aa"}, mapper);
		return u;
	}
	
	public int insertMember(){
		String sql="insert into member values(?,?,?,?)";
		Object[]  arr = new String []{"bb","a1","a2","a3"};
		//int x = jdbcTemplate.update(sql,arr);
		int x = getJdbcTemplate().update(sql,arr);
		//jdbcTemplate.execute("commit");
		return x;
	}
	
	public int countMember(){

		String sql = "select count(*) from member";
		//int x = jdbcTemplate.queryForObject(sql, Integer.class);
		int x = getJdbcTemplate().queryForObject(sql, Integer.class);
		return x;
	}
}
