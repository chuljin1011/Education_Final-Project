package xyz.itwill.dto;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

/*
create table qna_reply(num number primary key, writer varchar2(100), content varchar2(1000)
	, regdate date, board_num number, constraint qna_reply_board_num_fk foreign key(board_num) 
	references security_board(num) on delete cascade);
	    
create sequence qna_reply_seq;    
*/

@Data
public class QnaReply {
	private int num;
	private String writer;//작성자(아이디)
	@NotEmpty(message = "내용을 입력해 주세요.")
	private String content;
	private String regdate;
	private int boardNum;
	
	private String userName;//작성자(이름)
}