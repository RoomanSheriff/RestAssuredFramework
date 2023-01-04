package GenericLibraries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility {

	Connection con = null;
	
		/*Used to connect  to database*/
		public void connectToDB() throws Throwable
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection(IPathConstants.dbURL, IPathConstants.dbUsername, IPathConstants.dbPassword);
		}
		
		/*Used to read the data from database*/
		public String readDataFromDatabaseAndValidate(String query, int ColumnIndex, String expdata) throws Throwable
		{
			boolean flag = false;
			ResultSet result = con.createStatement().executeQuery(query);
			while(result.next())
			{
				 
				if(result.getString(ColumnIndex).equalsIgnoreCase(expdata))
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				System.out.println("data verified");
				return expdata;
			}
			else
			{
				System.out.println("data not verified");
				return "";
			}
		}
		
		/*Used to disconnect from database*/
		public void closeDB() throws Throwable
		{
		con.close();	
		}
	}

