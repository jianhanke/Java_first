class Car{
	private String carName;
	public Car(String carName) {
		this.carName=carName;
	}
	public void show() {
		System.out.println("����"+carName+"���л�������");
	}
}
class RadarCar{
	public Car myCar;
	public RadarCar (Car myCar) {
		this.myCar=myCar;
	}
	public void show() {
		System.out.println("���е����״﹦��");
	}
}

public class Example06 {
	public static void main(String[] args) {
		Car benz=new Car("Benz");
		System.out.println("----------��װǰ---------");
		benz.show();
		RadarCar decoratedCar_benz=new RadarCar(benz);
		System.out.println("----------��װ��---------");
		decoratedCar_benz.show();
	}
}
