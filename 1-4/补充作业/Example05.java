interface Shape {
   double area(double givenValue);
}
class Square implements Shape{
public double area(double sideLength) {
  return sideLength*sideLength;
 }
}
class Circle implements Shape{
public double area(double r) {
        return Math.Pl*r*r;
}
}
public class Test02{
 public static void main(String[] args){
 Shape square=new Square();
 Shape circle=new Circle=new Circle();
 System.out.println(square.area(2));
 System.out.println(circle.area(3));
}
}
