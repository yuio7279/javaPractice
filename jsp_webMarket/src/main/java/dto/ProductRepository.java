package dto;
//자바빈즈로 사용할 클래스.... 상품 데이터 접근 클래스 만들기

import dto.Product;
import java.util.ArrayList;

public class ProductRepository {

	private ArrayList<Product> listOfProducts = new ArrayList<>();
	
	public ProductRepository() {
		Product phone = new Product("P1234","iPhone 6s", 800000);
		phone.setDescription("4.7-inch, 1334X750 Renina HD display,8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
		
		Product notebook = new Product("P1235", "LG PC 그램", 1500000);
		notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation Intel Core processors");
		notebook.setCategory("Note Book");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");
		
		
		Product tablet = new Product("P1236","Galaxy Tab 5", 900000);
		tablet.setDescription("212.8*125.6*6.6mm, Super AMOLED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet); //디폴트 생성자
		}
	public ArrayList<Product> getAllProducts()
	{
		return listOfProducts;
	}
	
}
