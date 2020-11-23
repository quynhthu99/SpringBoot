package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Helper.DatabaseUtil;

public class DAO {
	List<DTO> listBook = new ArrayList<>();

	public List<DTO> getListBook() throws SQLException {

		String sql = "select * from book";
		PreparedStatement ps = DatabaseUtil.getInstance().getConn().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			DTO book = new DTO();
			book.setNameBook(rs.getString(1));
			book.setAuthorBook(rs.getString(2));
			book.setCategoryBook(rs.getString(3));
			book.setIdBook(rs.getInt(4));
			listBook.add(book);
		}

		return listBook;
	}

	public boolean addBook(DTO book) throws SQLException {
		String sql = "insert into book(Name, author, category, id) values ( ?,?,?,?) ";
		PreparedStatement ps = DatabaseUtil.getInstance().getConn().prepareStatement(sql);

		ps.setString(1, book.getNameBook());
		ps.setString(2, book.getAuthorBook());
		ps.setString(3, book.getCategoryBook());
		ps.setInt(4, book.getIdBook());

		return ps.executeUpdate()>0;

	}

	public boolean updateBook(DTO book) throws SQLException {
		String sql = "update [book] set name =?, author = ?,category=? where id = ?";
		PreparedStatement ps = DatabaseUtil.getInstance().getConn().prepareStatement(sql);
		ps.setString(1, book.getNameBook());
		ps.setString(2, book.getAuthorBook());
		ps.setString(3, book.getCategoryBook());
		ps.setInt(4, book.getIdBook());

		return ps.executeUpdate() > 0;

	}

	public boolean deleteBook(int id) throws SQLException {
		String sql = "delete from book where id = ?";
		PreparedStatement ps = DatabaseUtil.getInstance().getConn().prepareStatement(sql);
		ps.setInt(1, id);
		return ps.executeUpdate() > 0;
	}

}
