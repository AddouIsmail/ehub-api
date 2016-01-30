package ehub.api.Repositories;



import org.springframework.data.mongodb.repository.MongoRepository;

import ehub.api.Entities.Admin;

public interface AdminRepository extends MongoRepository<Admin, String>{

}
