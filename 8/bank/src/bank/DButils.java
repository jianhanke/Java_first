package bank;
import java.util.*;
import java.io.*;

public class DButils {
	private static DButils instance = null;
	private HashMap<String, User> Users =new HashMap<String,User>();
	private FileInputStream fis;
	private FileOutputStream fos;
	private LineNumberReader lr;	
	private DButils() {
		try {
			// getUersFromInputStream("user.dat");
			getAllUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//获取所有 用户值
	private void getUersFromInputStream(String isName) throws Exception{  
		fis = new FileInputStream(isName);
		byte[] content=new byte[1024];
		int i=0;
		int conInteger=0;
		while(true) {
			conInteger =fis.read();
			if(conInteger==-1) {
				break;
			}
			else if('\r'==(char)conInteger || '\n'==(char)conInteger) {
				this.processUserString(new String(content,"GBK"));
				i=0;
				System.out.println("最上上面的");
				continue;
			}else {
				content[i]=(byte)conInteger;
				i++;
			}
		}
	}
	//获取所有用户值 一行一行获取
	private void getAllUser() throws Exception{
		FileReader fr=new FileReader("user.dat");
		lr = new LineNumberReader(fr);
		String line=null;
				while((line=lr.readLine())!=null) {
					this.processUserString(line);
				}
		
	}
	public void processUserString(String userString) {	
		String[] userFields=userString.split(",");
		User u1=new User();
		u1.setcardId(userFields[0]);
		u1.setcardPwd(userFields[1]);
		u1.setuserName(userFields[2]);
		u1.setcall(userFields[3]);
		u1.setaccount(Integer.parseInt(userFields[4]));
		Users.put(u1.getcardId(),u1);
	}
	public static DButils getInstance(){
		if(instance==null) {
			synchronized(DButils.class) {
				if(instance == null) {
					instance=new DButils();
				}
			}
		}
		return instance;
	}
	public User getUser(String cardId) {
		User user=(User) Users.get(cardId);
		return user;
	}
	public HashMap<String, User> getUsers(){
		return Users;
	}
	//注册信息，更新到User
	public void addUser(User u) {
		Users.put(u.getcardId(),u);
	}
	//User 存储到
	public void update() throws Exception {
		Set<String> userSet =Users.keySet();
		StringBuffer uStringBuffer=new StringBuffer(); 
		for(String cardId:userSet) {      //  HashMap无序  
			User u=(User)Users.get(cardId);
			String uString=u.getcardId()+","
					+u.getcardPwd()+","
					+u.getuserName()+","
					+u.getcall()+","
					+u.getaccount()+"\n";
			uStringBuffer.append(uString);
		}	
			fos=new FileOutputStream("user.dat");
			fos.write(uStringBuffer.toString().getBytes("GBK"));
			fos.close();
	}
}

