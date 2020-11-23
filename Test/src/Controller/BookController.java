package Controller;

import java.util.ArrayList;

import Model.DAO.DAO;
import Model.DTO.Book;

public class BookController {
	DAO bookDao = new DAO();
	
	public void showBooks(){
		bookDao.showBooks();
		
	}
	
	public boolean addBook(Book e) {
		return bookDao.addBook(e);
	}
	public boolean deleteBook(int id) {
		return bookDao.deleteBook(id);
	}
	
	
	
	
}
