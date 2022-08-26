package com.pricing.repositoy;

import com.pricing.data.PriceItemDAO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends ReactiveMongoRepository<PriceItemDAO, String> {
	
	
	
}
