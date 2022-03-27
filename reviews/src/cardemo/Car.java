
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
		return String.format("��� : %s ���� : %s ���� : %d ����Ÿ� : %d",model,gasoline,age,mileage);
	}
	
	public static final List<Car> cars = Arrays.asList(
			new Car("�ҳ�Ÿ",true,10,21000),new Car("�ڶ���",false,22,200000),
			new Car("�ƹݶ�",true,12,150000),new Car("���׽ý�",false,21,1100000)
			);
	
	
			
	
}
