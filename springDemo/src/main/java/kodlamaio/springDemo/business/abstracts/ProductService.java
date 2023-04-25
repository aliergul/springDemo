package kodlamaio.springDemo.business.abstracts;

import java.util.List;

import kodlamaio.springDemo.core.utilities.results.DataResult;
import kodlamaio.springDemo.core.utilities.results.Result;
import kodlamaio.springDemo.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	
	Result add(Product product);
}
