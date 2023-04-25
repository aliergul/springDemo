package kodlamaio.springDemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.springDemo.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	
}
