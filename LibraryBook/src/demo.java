import java.sql.Connection;

public class demo {
	public static void main(String[] args) {
		Test connectDB = new Test();
		Connection connection = connectDB.getConnect();
		System.out.println(connection);
	}
}