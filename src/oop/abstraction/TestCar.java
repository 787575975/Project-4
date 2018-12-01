package oop.abstraction;

public class TestCar {

	public static void main(String[] args) {
		Car car= new Tesla();
		car.start();
		car.stop();
		
		Tesla modelS = new Tesla();
		modelS.motoCar();
		modelS.start();
		
		MotorCar hybridCar = new Tesla();
		hybridCar.fourWheelCar();
		
		BMW fiveSeries = new BMW();
		fiveSeries.start();
		fiveSeries.stop();
		
		
		
		
	}

}
