package com.example.controller;

import java.io.FileInputStream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello.............";
	}

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageName", "about");
		return "home";
	}
  
//	JAVA SE 버전 17일때코드
//	@GetMapping("/display") // localhost:8080/display?file=/upload/이미지 이름.jpg
//	public @ResponseBody byte[] display(String file) throws Exception {
//		FileInputStream in = new FileInputStream("c:" + file);
//		return IOUtils.toByteArray(in);
//	}
	
	//JAVA SE-17 이상일때 코드 
	@GetMapping("/display")
	public ResponseEntity<Resource> display(String file) {
		Resource resource = new FileSystemResource("c:" + file);
		if (!resource.exists())
			return new ResponseEntity<Resource>(HttpStatus.NOT_FOUND);
		HttpHeaders header = new HttpHeaders();
		try {
			Path filePath = Paths.get("c:" + file);
			header.add("Content-type", Files.probeContentType(filePath));
		} catch (Exception e) {
			System.out.println("오류:" + e.toString());
		}
		return new ResponseEntity<Resource>(resource, header, HttpStatus.OK);
	}
}
