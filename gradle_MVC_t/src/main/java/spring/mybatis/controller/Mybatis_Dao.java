package spring.mybatis.controller;

import org.apache.ibatis.session.SqlSession;
import spring.dto.FileDto;

public class Mybatis_Dao{

	SqlSession session;

	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	public int insertFile(FileDto dto){
		int x = 0;
		x = session.insert("file.insertFile", dto);
		return x;
	}
	
	
}
