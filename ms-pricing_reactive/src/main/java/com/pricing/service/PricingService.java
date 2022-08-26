package com.pricing.service;

import com.pricing.bean.PriceModel;
import com.pricing.data.PriceItemDAO;

import reactor.core.publisher.Mono;


public interface PricingService {

    PriceModel calcultePriceForItems(PriceModel model);

	Mono<PriceItemDAO> addPriceItemToDb(Mono<PriceItemDAO> priceItemDAO);

    

}
