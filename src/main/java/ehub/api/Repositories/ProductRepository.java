package ehub.api.Repositories;



import org.springframework.data.mongodb.repository.MongoRepository;

import ehub.api.Entities.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
