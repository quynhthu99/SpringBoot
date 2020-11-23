package Main;

import Controller.BookController;
import Model.DTO.Book;
import View.BookView;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookView bookView = new BookView();
		BookController bookController = new BookController();
		bookController.showBooks();
		Book e = new Book("bbbb",2,3);
		Book eBook = new Book("a",1,2);
		System.out.println(bookController.addBook(e));
		System.out.println(bookController.addBook(eBook));
		bookController.showBooks();
		System.out.println(bookController.deleteBook(2));
		bookController.showBooks();
	}

}
 