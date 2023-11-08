package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.MysqlDAO;
import com.example.dao.PostDAO;
import com.example.domain.PostVO;

@SpringBootTest
public class MysqlTest {
	@Autowired
	MysqlDAO dao;
	
	@Autowired
	PostDAO pdao;
	
//	@Test
//	public void insert() {
//		PostVO vo=new PostVO();
//		vo.setTitle("안녕하세요!");
//		vo.setWriter("sky");
//		pdao.insert(vo);
//	}
//	
//	@Test
//	public void update() {
//		PostVO vo=new PostVO();
//		vo.setTitle("환영합니다 김창욱입니다.");
//		vo.setBody("내용을 수정합니다.");
//		vo.setPid(1);
//		pdao.update(vo);
//	}
//	
//
//	
//	@Test
//	public void read() {
//		pdao.read(1);
//	}
//	
//	@Test
//	public void delete() {
//		pdao.delete(4);
//	}
//	
//	@Test
//	public void list() {
//		pdao.HashMap();
//	}
	
//	@Test
//	public void now() {
//		System.out.println("현재시간:" + dao.now());
//	}
	
	
}
