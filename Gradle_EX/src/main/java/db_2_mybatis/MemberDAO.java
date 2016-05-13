package db_2_mybatis;

import java.util.List;

//import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class MemberDAO extends SqlSessionDaoSupport {

/*
	SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	}
*/
	public List<User> selectAllMem() {
		//return session.selectList("selectAll");
		return getSqlSession().selectList("selectAll");
	}


}
