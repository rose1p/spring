package com.example.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.CommentDAO;
import com.example.domain.CommentVO;
import com.example.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	@Autowired
	CommentDAO dao;
	
	@Autowired
	CommentService service;
	
	@GetMapping("/list.json") //localhost:8080/comments/list.json?pid=516&page=1&size=10
	public List<HashMap<String, Object>> list(int pid, int page, int size) {
		return dao.list(pid,  page, size);
	}
	
	@GetMapping("/total")
	public int total(int pid) {
		return dao.total(pid);
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody CommentVO vo) {
		service.insert(vo);
	}
	
	@GetMapping("/delete")
	public void delete(int cid) {
		service.delete(cid);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody CommentVO vo) {
		dao.update(vo);
	}
}
