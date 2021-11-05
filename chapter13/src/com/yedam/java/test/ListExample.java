package com.yedam.java.test;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for (Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
	 class Board {
		private String Title;
		private String Content;
		public Board(String title, String content) {
			super();
			Title = title;
			Content = content;
		}
		public String getTitle() {
			return Title;
		}
		public String getContent() {
			return Content;
		}	
	}

	class BoardDao {
		private List<Board> list = null;

		public List<Board> getBoardList() {
			List<Board> list = new ArrayList<Board>();
			list.add(new Board("제목1","내용1"));
			list.add(new Board("제목2","내용2"));
			list.add(new Board("제목3","내용3"));
			return list;

		}

	}
