import java.sql.*;  
class FetchRecord{  
public static void main(String args[])throws Exception{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
Statement stmt=con.createStatement();  
  
//stmt.executeUpdate("insert into emp765 values(33,'Irfan',50000)");  
//int result=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000 where id=33");  
int result=stmt.executeUpdate("delete from emp765 where id=33");  
System.out.println(result+" records affected");  
con.close();  
}}  