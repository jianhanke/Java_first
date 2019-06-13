package Enity;

public class Person {
	
	private String User_account;
	private String User_pwd;
	private String  User_name;
	private String  Borrow_book;
	
	public void setAccount(String account) {
		this.User_account=account;
	}
	public String getAccount() {
		return this.User_account;
	}
	public void setPwd(String pwd) {
		this.User_pwd=pwd;
	}
	public String getPwd() {
		return this.User_pwd;
	}
	public void setName(String name) {
		this.User_name=name;
	}
	public String getName() {
		return this.User_name;
	}
	public void setBorrow_book(String book) {
		 this.Borrow_book=book;
	}
	public String getBorrow_book() {
		return this.Borrow_book;
	}
	
}
