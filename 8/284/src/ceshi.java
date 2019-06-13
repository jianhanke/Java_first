import java.util.HashMap;



public class ceshi {
	public void show() {
	 HashMap<String, String>  idcourse;
	 String str="3,4,5";
	 String[] course=str.split(",");
	 StringBuffer strbufer=new StringBuffer();
	 
	 for(int i=0;i<course.length;i++) {
		 if(  i ==1-1) {
			course[i]="0"+",";
			strbufer.append(course[i]);
		 }else {
			 course[i]=course[i]+",";
			 strbufer.append(course[i]);
		 }
	 }
	
	 System.out.println(strbufer.toString());
	 
	}
	 public static void main(String[] args) {
		 	ceshi ce=new ceshi();
		 	ce.show();
	 }
}
