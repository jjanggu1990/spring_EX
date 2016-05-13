package db_2_mybatis;

import java.util.List;

//import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class ZipcodeDAO extends SqlSessionDaoSupport {

/*
	SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	}
*/
	public List<Zipcode> selectAllZip(String area4) {
		//return session.selectList("selectAll");
		return getSqlSession().selectList("select_zipcode",area4);
	}


}
