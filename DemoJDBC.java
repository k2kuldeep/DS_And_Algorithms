import java.sql.*;
import java.util.*;

public class DemoJDBC {

	static Connection con;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","rat");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query = "Insert into login(id,name,password) values(?,?,?)";
		
		System.out.println("Enter id, name, password");
		String id = sc.next();
		String name = sc.next();
		String pass = sc.next();
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,id);
			ps.setString(2, name);
			ps.setString(3, pass);
			
			int i = ps.executeUpdate();
			
			con.close();
			ps.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
