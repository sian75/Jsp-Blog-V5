package com.cos.blog.domain.board;

import java.sql.Timestamp;

public class Board {
	private int id;
	private int userId;
	private String title;
	private String content;
	private int readCount;//조회수 디폴트값 0
	private Timestamp createDate;
}
