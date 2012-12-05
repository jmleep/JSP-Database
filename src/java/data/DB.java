package data;
import business.User;
import java.sql.*;
import java.util.ArrayList;
public class DB {
	private Connection connect = null;
	private String dbURL = "jdbc:mysql://157.62.23.146/blackdc08";
	private String username = "blackdc08";
	private String password = "blackdc08";

	public DB() {
		getConnection();
	}

	private void getConnection() {
		try {
		connect = DriverManager.getConnection(dbURL, username, password);
		}
		catch (SQLException e) {
		System.out.println("Exception thrown calling getConnection.\n" + e.getMessage());
		}
	}
	
	public void addUser(User user) {
		PreparedStatement ps = null;
		try {
			String q = "insert into user (userId, imagePath, firstName, lastName, expertise, emailAddress, schedule) "
				+ "values (null, ?, ? ,? ,?, ?, ?)";
			ps = connect.prepareStatement(q);
			ps.setString(1, user.getImagePath());
			ps.setString(2, user.getFirstName());
			ps.setString(3, user.getLastName());
			ps.setString(4, user.getExpertise());
			ps.setString(5, user.getEmailAddress());
			ps.setString(6, user.getSchedule());
			ps.executeUpdate();
			ps.close();
		}
		catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("\nQUERY: " + ps.toString());
		}
	}
        
       public void deleteUser(String emailAddress)
       {
           PreparedStatement ps = null;
		try {
			String q = "delete from user where emailAddress = ? ";
			ps = connect.prepareStatement(q);
			ps.setString(1, emailAddress);
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("\nQUERY: " + ps.toString());
		}
       }
                
	public void updateImage(String i, String emailAddress) {
		PreparedStatement ps = null;
		try {
			String q = "update user set imagePath = ? where emailAddress = ? ";
			ps = connect.prepareStatement(q);
                        ps.setString(1, i);
			ps.setString(2, emailAddress);
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("\nQUERY: " + ps.toString());
		}
	}
        
        public void updateFirstName(String i, String emailAddress) {
		PreparedStatement ps = null;
		try {
			String q = "update user set firstName = ? where emailAddress = ? ";
			ps = connect.prepareStatement(q);
                        ps.setString(1, i);
			ps.setString(2, emailAddress);
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("\nQUERY: " + ps.toString());
		}
	}
        public void updateLastName(String i, String emailAddress) {
		PreparedStatement ps = null;
		try {
			String q = "update user set lastName = ? where emailAddress = ? ";
			ps = connect.prepareStatement(q);
                        ps.setString(1, i);
			ps.setString(2, emailAddress);
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("\nQUERY: " + ps.toString());
		}
	}
        public void updateEmail(String i, String emailAddress) {
		PreparedStatement ps = null;
		try {
			String q = "update user set emailAddress = ? where emailAddress = ? ";
			ps = connect.prepareStatement(q);
                        ps.setString(1, i);
			ps.setString(2, emailAddress);
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("\nQUERY: " + ps.toString());
		}
	}
	public void updateExpertise(String i, String emailAddress) {
		PreparedStatement ps = null;
		try {
			String q = "update user set expertise = ? where emailAddress = ? ";
			ps = connect.prepareStatement(q);
                        ps.setString(1, i);
			ps.setString(2, emailAddress);
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("\nQUERY: " + ps.toString());
		}
	}
        public void updateSchedule(String i, String emailAddress) {
		PreparedStatement ps = null;
		try {
			String q = "update user set schedule = ? where emailAddress = ? ";
			ps = connect.prepareStatement(q);
                        ps.setString(1, i);
			ps.setString(2, emailAddress);
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("\nQUERY: " + ps.toString());
		}
	}
        
	public ArrayList<User> listUsers() {
		ArrayList<User> userList = new ArrayList<User>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String q = "select * from user";
			ps = connect.prepareStatement(q);
			rs = ps.executeQuery();
			while(rs.next()) {
				userList.add(new User(rs.getString("imagePath"), rs.getString("firstName"), 
					rs.getString("lastName"), rs.getString("expertise"), rs.getString("emailAddress"), rs.getString("schedule")));
			}
			rs.close();
			ps.close();
		}
		catch(SQLException se) {
			System.out.println("SQLException: " + se.getMessage());
			System.out.println("\nQUERY: " + ps.toString());
		}
		return userList;
	}
}
