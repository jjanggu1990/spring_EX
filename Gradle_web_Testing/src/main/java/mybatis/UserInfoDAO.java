package mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;


public class UserInfoDAO {
	SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	}

	public List selectAllFileInfo() {
		//return session.selectList("selectAll");
		return session.selectList("FileInfo.selectAll");
	}
}
