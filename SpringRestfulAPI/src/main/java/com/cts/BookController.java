package com.cts;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cts.dao.BookDAO;
import com.cts.dto.Book;
import com.cts.dto.Books;

@RestController
@RequestMapping(path = "/books")
public class BookController {

	@Autowired
	private BookDAO bookDAO;

	@RequestMapping(path = "/all")
    public Books getBooks()
    {
    	System.out.println("test");
        return bookDAO.getAllBooks();
    }
     
    @PostMapping(path= "/add", consumes = "application/json", produces = "application/json")
    public Books addEmployee(@RequestBody Book book)
    {
        Integer id = bookDAO.getAllBooks().getBookList().size() + 1;
        book.setBookId(id);
        return bookDAO.addBook(book);
    }
    
    @RequestMapping(path = "/get/{id}")
    public Book getBook(@PathVariable int id)
    {
    	System.out.println("test");
        return bookDAO.getBook(id);
    }
     
    @RequestMapping(path = "/delete/{id}",method = RequestMethod.DELETE)
    public  ResponseEntity<Object> deleteBook(@PathVariable int id)
    {
    	System.out.println("DeleteBook");
         bookDAO.deleteBook(id);
         
         URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                     .path("/{id}")
                                     .buildAndExpand(id)
          
                                     .toUri();
         return ResponseEntity.created(location).build();
    }
    
    @RequestMapping(path = "/update",consumes = "application/json")
    public Book updateBook(@RequestBody Book book)
    {
    	System.out.println("test");
        return bookDAO.updateBook(book.getBookId()-1,book);
    }    
}
