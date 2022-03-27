package cardemo;
import java.util.*;
public class CarDemo {

	
	public static List<Car> findCars(List<Car> ls,CarPredicate cp)
	{
		List<Car> result = new ArrayList<>();
		for(Car car : ls)
		{
			if(cp.test(car))
			{
				result.add(car);
			}
		}
		return result;
	}
	
	public static void printCars(List<Car> ls, CarConsumer cc)
	{
		for(Car car : ls)
		{
			cc.accept(car);
		}
	}
	public static void main(String[] args) {

		List<Car> diselCars = findCars(Car.cars , c->!c.isGasoline());
		printCars(diselCars,c-> System.out.printf("µðÁ© ÀÚµ¿Â÷ %s (%d) %s\n",c.getModel(),c.getAge(),c.isGasoline()));
	}
	
}