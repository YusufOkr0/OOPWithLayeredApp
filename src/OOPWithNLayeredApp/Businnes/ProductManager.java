package OOPWithNLayeredApp.Businnes;
import java.util.ArrayList;

import OOPWithNLayeredApp.DataAccess.IDataAccess;
import OOPWithNLayeredApp.Entities.Product;
import OOPWithNLayeredApp.Logging.ILogger;

public class ProductManager {

	IDataAccess dao;
	ArrayList<ILogger> Ilogger;
	
	public ProductManager(IDataAccess dao, ArrayList<ILogger> Ilogger) {
		this.dao = dao;
	}
	public void add(Product product) {
		this.dao.add(product);
	}
	
    public void delete(Product product) {
		
		this.dao.delete(product);
	}
    
    for(ILogger logger:this.Ilogger) {
    	
    	logger.log("14. SATIRDAKI HATA ");
    }
	
}
