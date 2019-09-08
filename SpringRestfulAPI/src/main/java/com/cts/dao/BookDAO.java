package com.cts.dao;

import org.springframework.stereotype.Repository;

import com.cts.dto.Book;
import com.cts.dto.Books;
@Repository
public class BookDAO {
	
	private static Books list = new Books();
    
    static
    {
        list.getBookList().add(new Book(1, "Let Us C", 23.45, 4,"12/12/1990"));
        list.getBookList().add(new Book(2, "Head First Java", 22.45, 5,"12/02/1999"));
        list.getBookList().add(new Book(3, "Learn .Net", 23.45, 14,"1/1/2011"));
    }

	public Books getAllBooks() {
		return list;
	}

	public Books addBook(Book book) {
		list.getBookList().add(book);
		return list;
	}
	
	public Book updateBook(int id,Book book) {
		list.getBookList().set(id,book);
		return list.getBookList().get(id);
	}
	public Boolean deleteBook(int id) {
		if(list.getBookList().get(id)!=null) {
			list.getBookList().remove(id);
			return true;
		}else {
			return false;
		}
	}
	public Book getBook(int id) {
	return	list.getBookList().get(id);
	}
}
