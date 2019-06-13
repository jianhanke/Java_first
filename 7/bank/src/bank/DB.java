package bank;
import java.util.*;
	


public class DB {
	private static DB instance = null;
	private HashMap<String, User> Users =new HashMap<String,User>();
	public static void main(String[] args) {
		DB db=new DB();
		System.out.println(db.DB().getUser("10001"));
	}
	
	private DB() {
		User u1=new User();
		u1.setcardId("10001");
		u1.setcardPwd("10001");
		u1.setuserName("张三");
		u1.setaccount(1000);
		u1.setcall("15239910806");
		Users.put(u1.getcardId(),u1);
		
		User u2=new User();
		u2.setcardId("10002");
		u2.setcardPwd("10002");
		u2.setuserName("李四");
		u2.setaccount(1000);
		u2.setcall("18337299830");
		Users.put(u2.getcardId(),u2);
	}
	public static DB getInstance(){
		if(instance==null) {
			synchronized(DB.class) {
				if(instance == null) {
					instance=new DB();
				}
			}
		}
		return instance;
	}
	public User getUser(String cardId) {
		User user=(User) Users.get(cardId);
		return user;
	}
	public User getUsers(){
		User user=(User) Users.get("10001");
		return user;
	}
					
}


