package kodlamaio.springDemo.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.springDemo.business.abstracts.ProductService;
import kodlamaio.springDemo.core.utilities.results.DataResult;
import kodlamaio.springDemo.core.utilities.results.Result;
import kodlamaio.springDemo.core.utilities.results.SuccessDataResult;
import kodlamaio.springDemo.core.utilities.results.SuccessResult;
import kodlamaio.springDemo.dataAccess.abstracts.ProductDao;
import kodlamaio.springDemo.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>
		(this.productDao.findAll(),"Data listelendi.");
				
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi.");
	}
	
}
