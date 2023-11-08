package com.spring.timecinema.reply.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.spring.timecinema.reply.entity.MovieReply;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MovieReplyRequestDTO {
	
	private int replyNo;
	private String writer;
	private String content;
	private String userId;
	private LocalDateTime regDate;
	
	public MovieReply toEntity(MovieReplyRequestDTO dto) {
		return MovieReply.builder()
						 .replyNo(dto.getReplyNo())
						 .writer(dto.getWriter())
						 .userId(dto.getUserId())
						 .content(dto.getContent())
						 .regDate(dto.getRegDate())
						 .build();
	}
	
	static String regdateModify(LocalDateTime regDate) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return dtf.format(regDate);
	}
	
}
