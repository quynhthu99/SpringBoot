import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
	
	public Connection getConnect() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/library";
		String user = "root";
		String password = "123456";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Con sc");
		} catch (Exception er) {
			er.printStackTrace();
		}
		return con;
	}
}