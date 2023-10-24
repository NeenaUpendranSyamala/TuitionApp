package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBValidation {
	
	    private static final String DB_URL = "jdbc:mysql://192.168.1.229:3306/tution_db";
	    private static final String USERNAME = "admin";
	    private static final String PASSWORD = "dbadmin";
	    
	    
	    public  static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
	       
	    }  

	    
	  public static boolean isUserExists(String username) throws SQLException {
	        String query = "SELECT COUNT(*) FROM teachers WHERE first_name = ?";
	        try (Connection connection = DBValidation.getConnection();
	             PreparedStatement statement = connection.prepareStatement(query)) {
	            statement.setString(1, username);
	            try (ResultSet resultSet = statement.executeQuery()) {
	                if (resultSet.next()) {
	                    int count = resultSet.getInt(1);
	                    return count > 0;
	                }
	            }
	        }
	        return false;
	    }
	  
	  public void verifyNewUser() {
		  String query = "select * from teachers where first_name='Jins'"; 
		  
		  try (Connection connection = DBValidation.getConnection();
		             PreparedStatement statement = connection.prepareStatement(query);
		             ResultSet resultSet = statement.executeQuery()) {
		            
		           
		            while (resultSet.next()) {
		              
		                String firstName = resultSet.getString("first_name");
		                String lastName = resultSet.getString("last_name");
		                
		              
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		  
	  }
	  

