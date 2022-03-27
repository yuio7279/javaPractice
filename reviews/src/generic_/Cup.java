package generic_;

public class Cup<T extends Beverage>{

	private T beverage;
	
	public T getBeverage() {
		return beverage;
	}
	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
}

