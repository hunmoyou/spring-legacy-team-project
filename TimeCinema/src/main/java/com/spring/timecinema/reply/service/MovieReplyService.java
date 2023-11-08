package com.spring.timecinema.reply.service;

import org.springframework.stereotype.Service;

import com.spring.timecinema.reply.dto.MovieReplyRequestDTO;
import com.spring.timecinema.reply.mapper.IMovieReplyMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieReplyService implements IMovieReplyService {
	
	private final IMovieReplyMapper mapper;
	
	
	// 댓글 추가
	public void insert(MovieReplyRequestDTO dto) {
		mapper.insert(dto.toEntity(dto));
	}
	
	//댓글 삭제
	public void delete(int replyNo) {
		mapper.delete(replyNo);
	}
	
	//댓글 수정
	public void modify() {
		
	}
	
}
