
package cardemo;

import java.util.*;

public class Car {

	private String model; private int age; 
	private int mileage; private boolean gasoline;


	public Car(String model,boolean gasoline, int age, int mileage) {
		super();
		this.model = model;
		this.age = age;
		this.mileage = mileage;
		this.gasoline = gasoline;
	}


	public String getModel() {
		return model;
	}


	public int getAge() {
		return age;
	}


	public int getMileage() {
		return mileage;
	}


	public boolean isGasoline() {
		return gasoline;
	}
	
	public String toString()
	{
		return String.format("모댈 : %s 디젤 : %s 연식 : %d 주행거리 : %d",model,gasoline,age,mileage);
	}
	
	public static final List<Car> cars = Arrays.asList(
			new Car("소나타",true,10,21000),new Car("코란도",false,22,200000),
			new Car("아반떼",true,12,150000),new Car("제네시스",false,21,1100000)
			);
	
	
			
	
}
