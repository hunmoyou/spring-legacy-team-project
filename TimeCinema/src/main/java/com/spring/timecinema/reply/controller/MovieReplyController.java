package com.spring.timecinema.reply.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.timecinema.reply.dto.MovieReplyRequestDTO;
import com.spring.timecinema.reply.service.MovieReplyService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/reply")
@RequiredArgsConstructor
@Slf4j
public class MovieReplyController {
	
	private final MovieReplyService service;
	
	//댓글 등록
	@PostMapping("/reply/detail")
	public String movieReplyinsert(@RequestBody MovieReplyRequestDTO dto) {
		service.insert(dto);
		return "ResistSuccess";
	}
	
	//댓글 삭제
	@DeleteMapping("/{replyNo}")
	public void delete(@PathVariable int replyNo) {
		service.delete(replyNo);
		//return "/movie/detail";
	}
	
	//댓글 수정?
	@PostMapping()
	public void modify() {
		
	}
}
