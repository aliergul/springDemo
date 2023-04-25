package kodlamaio.springDemo.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.springDemo.business.abstracts.ProductService;
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
	public List<Product> getAll() {
		return productDao.findAll();
	}
	
}
