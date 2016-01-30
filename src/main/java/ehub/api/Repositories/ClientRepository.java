package ehub.api.Repositories;


import org.springframework.data.mongodb.repository.MongoRepository;


import ehub.api.Entities.Client;

public interface ClientRepository extends MongoRepository<Client, String>{
    
}
