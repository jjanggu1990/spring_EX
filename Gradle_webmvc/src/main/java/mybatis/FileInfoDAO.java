package mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import spring.model.FileInfo;

public class FileInfoDAO{ //extends SqlSessionDaoSupport {


	SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	}

	public List<FileInfo> selectAllFileInfo() {
		//return session.selectList("selectAll");
		return session.selectList("FileInfo.selectAll");
	}
	public int insertFileInfo(FileInfo fileInfo){
		return session.insert("FileInfo.insert",fileInfo);
	}
	public FileInfo selectRealName(String filename){
		return session.selectOne("FileInfo.selectRealName",filename);
	}
	

}
