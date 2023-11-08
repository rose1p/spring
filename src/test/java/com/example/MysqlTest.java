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
//		vo.setTitle("�ȳ��ϼ���!");
//		vo.setWriter("blue");
//		pdao.insert(vo);
//	}
	
//	@Test
//	public void upddate() {
//		PostVO vo=new PostVO();
//		vo.setTitle("�ȳ��ϼ���! ��â���Դϴ�.");
//		vo.setBody("�����մϴ�.");
//		vo.setPid(1);
//		pdao.update(vo);
//	}
	

	
	@Test
	public void read() {
		pdao.read(1);
	}
	
//	@Test
//	public void delete() {
//		pdao.delete(3);
//	}
	
	@Test
	public void list() {
		pdao.list();
	}
	
	@Test
	public void now() {
		System.out.println("����:" + dao.now());
	}
	
	
}
