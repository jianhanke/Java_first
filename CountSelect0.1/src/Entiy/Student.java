package Entiy;

public class Student {
	private String id;
	private String pwd;
	private String name;
	private String gender;
	private String age;
	private String department;
	
 ///////////
	public void setId(String id){
		this.id=id; 
	}
	public String getId(){
		return id;
	}
///////////
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}
	public String setPwd() {
		return pwd;
	}
	
	public void setName(String name){
		this.name=name; 
	}
	public String getName(){
		return name;
	}
   /////////
	public void setGender(String gender){
		this.gender=gender;
	}
	public String getGender(){
		return gender;
	}
///////////
	public void setAge(String age){
		this.age=age;
	}
	public String getAge(){
		return age;
	}
///////////
	public void setDepatment(String department){
		this.department=department;
	}
	public String getDepartment(){
		return department;
	}
	
	
	
}
