import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args)throws Exception{
		
		//register driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "12345");
		//create jdbc statement
		Statement st=con.createStatement();
		//excute the query  and process the results
		ResultSet rs=st.executeQuery("select * from emp1");
		//print data base results
		while(rs.next()!=false) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getLong(3));
		}
         //close all jdbc Stream
		rs.close();
		st.close();
		con.close();
	}

}
