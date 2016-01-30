package ehub.api.Repositories;

import ehub.api.Entities.Facture;


import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Ismail on 29/01/2016.
 */
public interface FactureRepository extends MongoRepository<Facture, String> {

}
