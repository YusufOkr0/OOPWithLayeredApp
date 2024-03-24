package OOPWithNLayeredApp;

import java.util.ArrayList;

import OOPWithNLayeredApp.Businnes.ProductManager;
import OOPWithNLayeredApp.DataAccess.JDBC;
import OOPWithNLayeredApp.Entities.Product;
import OOPWithNLayeredApp.Logging.CoreLog;
import OOPWithNLayeredApp.Logging.EmailLog;
import OOPWithNLayeredApp.Logging.ILogger;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product("TV",1597);
		ArrayList<ILogger> logger = {new EmailLog(),new CoreLog()};
		ProductManager manager = new ProductManager(new JDBC(),logger);
		manager.add(product);
	}
}
