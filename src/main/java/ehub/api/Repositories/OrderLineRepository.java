package ehub.api.Repositories;

import ehub.api.Entities.OrderLines;


import org.springframework.data.mongodb.repository.MongoRepository;


public interface OrderLineRepository  extends MongoRepository<OrderLines, String> {

}
