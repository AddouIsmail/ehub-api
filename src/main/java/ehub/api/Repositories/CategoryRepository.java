package ehub.api.Repositories;



import org.springframework.data.mongodb.repository.MongoRepository;

import ehub.api.Entities.Category;

public interface CategoryRepository extends MongoRepository<Category, String>{

}
