package kodlamaio.springDemo.business.abstracts;

import java.util.List;
import kodlamaio.springDemo.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
