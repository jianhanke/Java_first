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
	       while(rs.next()){//��������������ݣ��ͻ�ѭ����ӡ����
		           System.out.println(rs.getString("booK_name")+","+rs.getString("author"));
		        }
	}
	
	
	private  static final String URL="jdbc:mysql://localhost:3306/learn?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf8&useSSL=false";
    private static final String NAME="root";
    private static final String PASSWORD="zhao/980931";
    private static Statement stmt=null;

    static {
    	try {
    	Class.forName("com.mysql.cj.jdbc.Driver");   //������������
    	Connection conn=DriverManager.getConnection(URL, NAME, PASSWORD); //������ݿ�����
    	 stmt=conn.createStatement();  //���� Statement����
    	 
    	}catch(Exception e) {
    		
    	}
    }
    public static Statement get_statement() {
		return stmt;
    }
    
}
			
		
	

