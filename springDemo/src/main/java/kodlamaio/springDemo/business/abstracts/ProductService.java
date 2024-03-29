package kodlamaio.springDemo.business.abstracts;

import java.util.List;


import kodlamaio.springDemo.core.utilities.results.DataResult;
import kodlamaio.springDemo.core.utilities.results.Result;
import kodlamaio.springDemo.entities.concretes.Product;

public interface ProductService {
	
    DataResult<List<Product>> getAll();
    DataResult<List<Product>> getAllSorted();
    DataResult<List<Product>> getAll(int pageNo, int pageSize);
    Result add(Product product);
   
    DataResult<Product> getByProductName(String productName);
	  
    DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	  
    DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);
	  
    DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
	  
    DataResult<List<Product>> getByProductNameContains(String productName);
	  
    DataResult<List<Product>> getByProductNameStartsWith(String productName);

    DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
    
    
}
