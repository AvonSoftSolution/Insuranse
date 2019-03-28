import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SetDataTODB {

	public static void main(String[] args)throws Exception {
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		//load the class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Establish the connection
          con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
          //create statement
          st=con.createStatement();
          //create result set obj
          rs=st.executeQuery("select * from Emp1 where name="+124);
          
          //print data 
          while(rs.next()) {
        	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+""+rs.getLong(3));
        	  
          }
          		//close all connection
           rs.close();
           st.close();
           con.close();
	}
public void m2(){
	System.out.println("added new methods");
}
