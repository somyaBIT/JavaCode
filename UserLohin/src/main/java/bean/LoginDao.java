package bean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import bean.LoginBean;

public class LoginDao {  
	public static String jdcUrl="jdbc:postgresql://localhost:5432/lmsdb";
    public static	String userName = "postgres";
    public static  String userPassword ="Admin@123";
    static DBConnection db = new DBConnection();
public static boolean validate(LoginBean bean){  
boolean status=false;  
try{  
 
	Connection con =db.getConnection(jdcUrl,userName,userPassword );
              
PreparedStatement ps=con.prepareStatement(  
    "select * from user432 where email=? and pass=?");  
  
ps.setString(1,bean.getEmail());  
ps.setString(2, bean.getPass());  
              
ResultSet rs=ps.executeQuery();  
status=rs.next();  
              
}catch(Exception e){
	e.printStackTrace();
}  
  
return status;  
  
}  
}  