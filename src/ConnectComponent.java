

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class ConnectComponent {
	
	Scanner sc=new Scanner(System.in);
	public boolean tryConnection() throws Exception{	

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/College?user=root&password=Ashonenata@2000&serverTimezone=UTC")){
				
			return conn.isValid(2);
    				   
		}
    }
	
	public void printTeachers() throws Exception {

		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/College?user=root&password=Ashonenata@2000&serverTimezone=UTC");
		Statement statement = connection.createStatement();
		ResultSet resultSet = 
		statement.executeQuery("SELECT * FROM Teachers");	
		
		while(resultSet.next()) {
			//Display values
            System.out.print("ID: " + resultSet.getInt("teacher_id"));
            System.out.print(", Name: " + resultSet.getString("Name"));
            System.out.print(", Subject: " + resultSet.getString("subject"));
            System.out.println(", Salary: " + resultSet.getInt("salary"));
		}

		resultSet.close();
		statement.close();
		connection.close();
		
	}
	
	public void insertTeachers() throws SQLException
	{
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/College?user=root&password=Ashonenata@2000&serverTimezone=UTC");
		Statement statement = connection.createStatement();
		
		System.out.println("Enter values to insert : ");
		System.out.println("Id : ");
		int id=sc.nextInt();
		System.out.println("Name : ");
		String name = sc.next();
		System.out.println("Subject : ");
		String subject=sc.next();
		System.out.println("Salary : ");
		int sal = sc.nextInt();
		System.out.println("Inserting records into the table...");  
		
		
	      String query = " insert into Teachers (teacher_id, name, subject, salary)"
	        + " values (?, ?, ?, ?)";

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = connection.prepareStatement(query);
	      preparedStmt.setInt (1, id);
	      preparedStmt.setString (2, name);
	      preparedStmt.setString   (3, subject);
	      
	      preparedStmt.setInt    (4, sal);

	     
	      preparedStmt.execute();
      //  String sql = "INSERT INTO Teachers VALUES ("+id+","+name+","+subject+","+sal+")";
        //statement.executeUpdate(sql);
        
        System.out.println("Inserted records into the table...");   
        
        preparedStmt.close();
		connection.close();
	}
	
	public void updateTeachers() throws SQLException
	{
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/College?user=root&password=Ashonenata@2000&serverTimezone=UTC");
		Statement statement = connection.createStatement();
		
		System.out.println("Enter id to update : ");
		System.out.println("Id : ");
		int id=sc.nextInt();
		System.out.println("Name : ");
		String name = sc.next();
		System.out.println("Subject : ");
		String subject=sc.next();
		System.out.println("Salary : ");
		int sal = sc.nextInt();
		System.out.println("Updating records into the table...");  
		
		String query ="UPDATE Teachers SET name=?,subject=?,salary=? WHERE teacher_id=?";
		
	      

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = connection.prepareStatement(query);
	     
	      preparedStmt.setString (1, name);
	      preparedStmt.setString   (2, subject);
	      
	      preparedStmt.setInt    (3, sal);
	      preparedStmt.setInt (4, id);
	     
	      preparedStmt.execute();
      //  String sql = "INSERT INTO Teachers VALUES ("+id+","+name+","+subject+","+sal+")";
        //statement.executeUpdate(sql);
        
        System.out.println("Updated record into the table...");   
        
        preparedStmt.close();
		connection.close();
	}
	
	public void deleteTeachers() throws SQLException
	{
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/College?user=root&password=Ashonenata@2000&serverTimezone=UTC");
		Statement statement = connection.createStatement();
		
		System.out.println("Enter id to delete : ");
		System.out.println("Id : ");
		int id=sc.nextInt();
		
		 String query = "delete from Teachers where teacher_id = ?";
	      PreparedStatement preparedStmt = connection.prepareStatement(query);
	      preparedStmt.setInt(1, id);

	      // execute the preparedstatement
	      preparedStmt.execute();
	      System.out.println("Deleted record from the table...");  
	      preparedStmt.close();
			connection.close();
	      
	}
	

}
