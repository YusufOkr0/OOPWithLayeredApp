package OOPWithNLayeredApp.Businnes;
import OOPWithNLayeredApp.DataAccess.IDataAccess;
import OOPWithNLayeredApp.Entities.Product;

public class ProductManager{
IDataAccess dao;
  	
	public ProductManager(IDataAccess dao) {
		this.dao = dao;
	}
	public void add(Product product) {
		this.dao.add(product);
	}
	
    public void delete(Product product) {
		
		this.dao.delete(product);
	}
}

