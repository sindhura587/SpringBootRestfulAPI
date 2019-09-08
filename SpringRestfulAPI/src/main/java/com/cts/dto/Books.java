package com.cts.dto;

import java.util.ArrayList;
import java.util.List;

public class Books {

	public List<Book> bookList;
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	public List<Book> getBookList() {
		  if(bookList == null) {
			  bookList = new ArrayList<Book>();
	        }
	        return bookList;
	}

}
