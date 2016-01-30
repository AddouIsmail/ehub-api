package ehub.api.Repositories;


import org.springframework.data.mongodb.repository.MongoRepository;

import ehub.api.Entities.PaymentMode;

/**
 * Created by Ismail on 29/01/2016.
 */
public interface PaymentModeRepository extends MongoRepository<PaymentMode, String> {

}
