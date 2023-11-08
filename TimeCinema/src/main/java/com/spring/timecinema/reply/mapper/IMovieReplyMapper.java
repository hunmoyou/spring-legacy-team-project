package com.spring.timecinema.reply.mapper;

import com.spring.timecinema.reply.entity.MovieReply;

public interface IMovieReplyMapper {
	
	//댓글 리뷰 등록
	void insert(MovieReply reply);
	//댓글 리뷰 삭제
	void delete(int replyNo);
	
	//수정
	
	//좋아요
}
