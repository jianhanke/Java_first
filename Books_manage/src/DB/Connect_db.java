package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect_db {
	
	public static void main(String[] args) throws SQLException {
		stmt=Connect_db.get_statement();
		ResultSet rs = stmt.executeQuery("select * from books");
	       while(rs.next()){//如果对象中有数据，就会循环打印出来
		           System.out.println(rs.getString("booK_name")+","+rs.getString("author"));
		        }
	}
	
	
	private  static final String URL="jdbc:mysql://localhost:3306/learn?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf8&useSSL=false";
    private static final String NAME="root";
    private static final String PASSWORD="zhao/980931";
    private static Statement stmt=null;

    static {
    	try {
    	Class.forName("com.mysql.cj.jdbc.Driver");   //加载驱动程序
    	Connection conn=DriverManager.getConnection(URL, NAME, PASSWORD); //获得数据库连接
    	 stmt=conn.createStatement();  //创建 Statement对象
    	 
    	}catch(Exception e) {
    		
    	}
    }
    public static Statement get_statement() {
		return stmt;
    }
    
}
			
		
	

