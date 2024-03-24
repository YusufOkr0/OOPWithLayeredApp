package OOPWithNLayeredApp.DataAccess;

import OOPWithNLayeredApp.Entities.Product;

public class Hibernate implements IDataAccess{

	public void add(Product product) {
		
		System.out.println(product.getName() + " hibernate ile veri tabanina eklendi");
		
	}
	public void delete(Product product) {
		
		System.out.println(product.getName() + " hibernate ile veri tabanindan kaldirildi");
	}
}
