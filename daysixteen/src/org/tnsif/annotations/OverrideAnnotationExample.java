package org.tnsif.annotations;
//parent class
class Car{
	public void speed(int speed) {
		System.out.println("Speed is "+speed+"km/hr");
	}
}

//child class
class Mercedes extends Car{
	@Override
	public void speed(int speed) {
		System.out.println("Speed is "+speed+" km/hr");
	}
}

public class OverrideAnnotationExample {

	public static void main(String[] args) {
		Mercedes m = new Mercedes();
		m.speed(109);
	}

}
