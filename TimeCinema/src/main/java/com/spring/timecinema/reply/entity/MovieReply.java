package com.spring.timecinema.reply.entity;

import java.time.LocalDateTime;

import org.springframework.cglib.core.Local;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
CREATE TABLE reply(
	    reply_no NUMBER PRIMARY KEY,
	    writer VARCHAR2(100) NOT NULL,
	    userId VARCHAR2(100) NOT NULL,
	    content VARCHAR2(4000),
	    reg_date DATE DEFAULT sysdate
	);
	
CREATE SEQUENCE reply_seq
    START WITH 1
    INCREMENT BY 1
    MAXVALUE 100000
    NOCYCLE
    NOCACHE;
    
*/

@Getter @Setter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieReply {
	
	private int replyNo;   //댓글번호
	private String writer;  // 작성자
	private String userId;  // 작성자 아이디
	private String content; // 댓글 내용
	private LocalDateTime regDate; //댓글 단 시간
	
}
