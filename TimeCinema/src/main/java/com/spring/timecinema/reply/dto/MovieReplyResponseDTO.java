package com.spring.timecinema.reply.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.spring.timecinema.reply.entity.MovieReply;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode
public class MovieReplyResponseDTO {
	
	private int replyNo;
	private String writer;
	private String userId;
	private String content;
	private String regDate;
	
	public MovieReplyResponseDTO(MovieReply reply) {
		this.replyNo = reply.getReplyNo();
		this.writer = reply.getWriter();
		this.userId = reply.getUserId();
		this.content = reply.getContent();
		this.regDate = regdateModify(reply.getRegDate());
	}
	
	static String regdateModify(LocalDateTime regDate) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return dtf.format(regDate);
	}
	
}
