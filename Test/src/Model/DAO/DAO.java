package Model.DAO;

import java.util.ArrayList;

import Model.DTO.Book;

public class DAO {
	
		ArrayList<Book> arrayList = new ArrayList<>();
		public void showBooks(){
			
			for (int i = 0; i < arrayList.size(); i++) {
				System.out.println(arrayList.get(i).toString());
			}
		}
		
		public boolean addBook(Book e) {
			if(arrayList.add(e)) return true;
			return false;
		}
		public boolean deleteBook(int id) {
			for (int i = 0; i < arrayList.size(); i++) {
				if(arrayList.get(i).getId()==id) {
					arrayList.remove(i);
					return true;
				}
				
			}
			return false;
		}
	
}
