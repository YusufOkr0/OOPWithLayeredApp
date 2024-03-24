package OOPWithNLayeredApp;

import OOPWithNLayeredApp.Businnes.ProductManager;
import OOPWithNLayeredApp.DataAccess.JDBC;
import OOPWithNLayeredApp.Entities.Product;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product("TV",1597);
		
		ProductManager manager = new ProductManager(new JDBC());
		manager.add(product);
	}
}
