interface Shape{
	double area(double n);
	void speak();
}
class Square implements Shape{
	double num;
	public double area(double a){
		num=a*a;
	return num;
	
	}
	public void speak(){
		System.out.println("174804054+’‘≈‡ §");
	}
}
class Circle implements Shape{
	public double area(double r){
	return 3.1415926*r*r;
	}
	public void speak(){
		System.out.println("174804054+’‘≈‡ §");
	}
}
public class Example10{
	public static void main (String[] args){
	Shape sq= new Square();
	Shape ci=new Circle();
	System.out.println(sq.area(2));
	System.out.println(ci.area(3));
	sq.speak();
	ci.speak();
	}
}
