package OOPWithNLayeredApp.DataAccess;

import OOPWithNLayeredApp.Entities.Product;

public class JDBC implements IDataAccess{

	
	public void add(Product product) {
		
		System.out.println(product.getName() + " JDBC ile veri tabanina eklendi");
		
	}
	public void delete(Product product) {
		
		System.out.println(product.getName() + " JDBC ile veri tabanindan kaldirildi");
	}

	
}
