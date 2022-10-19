package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementInt {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/p4", "root", "root");

		int id = 15;

		String query = "select * from emp2 where id=?";

		PreparedStatement pst = conn.prepareStatement(query);
		pst.setInt(1, id);

		ResultSet res = pst.executeQuery();
		while (res.next()) {
			System.out.print(res.getString("id"));
			System.out.print("\t" + res.getString("name"));
			System.out.print("\t" + res.getString("loc"));
			System.out.println();
		}

	}
}
