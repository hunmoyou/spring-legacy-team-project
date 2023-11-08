package com.spring.timecinema.reply.service;

import com.spring.timecinema.reply.dto.MovieReplyRequestDTO;

public interface IMovieReplyService {
	
	
	//댓글 등록
	void insert(MovieReplyRequestDTO dto);
	
	//댓글 삭제
	void delete(int replyNo);
	
}
