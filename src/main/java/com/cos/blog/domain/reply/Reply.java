package com.cos.blog.domain.reply;

import java.sql.Timestamp;

public class Reply {
	private int id;
	private int userId;
	private int boardId;
	private String content;
	private Timestamp createDate;
}
