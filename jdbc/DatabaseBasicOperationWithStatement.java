package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// step1 - java-mysql library connectvity conector library
// step2 - load driver and create connection instance



class Emp1{
	private int id;
	private String name;
	private String loc;
	
}

public class DatabaseBasicOperationWithStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/p4", "root", "root");
		String query="select * from emp1";
		Statement stmt=con.createStatement();
	    ResultSet res=  stmt.executeQuery(query);
	 	while(res.next()) {
	 		System.out.print("\t"+res.getString("name"));
	 		System.out.print("\t"+res.getString("loc"));
	 		System.out.println();
	 	}
	
	}
}
