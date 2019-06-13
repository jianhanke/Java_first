package Gui;
import DB.*;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.Spring;

import com.mysql.cj.xdevapi.Statement;

import DB.*;

public class Ceshi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		int num=1;
		
		java.sql.Statement stmt= Connect_db.get_statement();
		ResultSet rs = ((java.sql.Statement) stmt).executeQuery("select * from books");
	       while(rs.next()){//如果对象中有数据，就会循环打印出来
	    	   
		           System.out.println(rs.getString("booK_name")+","+rs.getString("author"));
		         String book_name=rs.getString("book_name");  //下标0
		         String author =rs.getString("author");      //下标1
		         String pircture=rs.getString("picture");    //下标2
		         String press=rs.getString("press");
		         String str[]= {book_name,author,pircture,press};
		         
		         map.put(num, map);
		         num+=1;
		  
		         
//		         String[] str=new String[100];
//		         str[0]=book_name;
//		         str[2]=author;
		         
		  }
	       for(int i=0;i<=100;i++) {
	       String[] str3=(String[]) map.get(i);
	         System.out.println(str3);
	       }
		
	}

}
