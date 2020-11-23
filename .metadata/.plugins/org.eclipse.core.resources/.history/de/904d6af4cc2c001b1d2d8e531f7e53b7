package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.DAO;
import Model.DTO;

public class BookController {
	DAO dao = new DAO();
	//List listBook = new ArrayList<>();
public List<DTO> getListBook() throws SQLException{
	return dao.getListBook();
}
public boolean createBook(DTO book) throws SQLException {
	return dao.addBook(book);
	
}
public boolean updateBook(DTO book) throws SQLException {
	return dao.updateBook(book);
}
public boolean deleteBook(int id) throws SQLException {
	return dao.deleteBook(id);
}
}
