package com.pricing.service.impl;

import com.pricing.bean.ItemPricingResponse;
import com.pricing.bean.OrderPriceResponse;
import com.pricing.bean.PriceItemRequest;
import com.pricing.bean.PriceModel;
import com.pricing.data.PriceItemDAO;
import com.pricing.repositoy.PriceRepository;
import com.pricing.service.PricingService;

import reactor.core.publisher.Mono;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class PricingServiceImpl implements PricingService {

    private PriceRepository priceRepository;

   

	public PricingServiceImpl(PriceRepository priceRepository){
        this.priceRepository = priceRepository;
    }

    @Override
    public PriceModel calcultePriceForItems(PriceModel model) {
        AtomicReference<Double> orderAmount = new AtomicReference<>(0.0);

        AtomicReference<Double> discounted = new AtomicReference<>(0.0);
        model.getItems().forEach(item->{
            ItemPricingResponse itemReponse = priceEachItem(item);
            if(itemReponse != null) {
                orderAmount.set(orderAmount.get() + itemReponse.getFinalPrice());
                discounted.set(discounted.get() + itemReponse.getDiscount());
            }
            item.setItemPriceInfo(itemReponse);
        });
        OrderPriceResponse orderPriceResponse = new OrderPriceResponse("MEX", model.getItems().size(), orderAmount.get(),
                                                discounted.get(),orderAmount.get());


        model.setOrderPriceInfo(orderPriceResponse);
        return model;
    }

    private ItemPricingResponse priceEachItem(PriceItemRequest itemRequest){
        //Optional<PriceItemDAO> priceItem = priceRepository.findById(itemRequest.getSkuId());
    	Optional<PriceItemDAO> priceItem = null;
        ItemPricingResponse itemReponse = null;
        if(priceItem.isPresent()){
            if(priceItem.get().getSaleprice() !=0 && priceItem.get().getSaleprice() < priceItem.get().getListPrice()){
                itemReponse = new ItemPricingResponse(priceItem.get().getSkuid(), priceItem.get().getProductId(),
                                        priceItem.get().getSaleprice(), priceItem.get().getListPrice(), priceItem.get().getSaleprice() * itemRequest.getQty(),
                        "MEX", true, (priceItem.get().getListPrice() * itemRequest.getQty()) - (priceItem.get().getSaleprice() * itemRequest.getQty()));

            }else{
                itemReponse = new ItemPricingResponse(priceItem.get().getSkuid(), priceItem.get().getProductId(),
                        priceItem.get().getSaleprice(), priceItem.get().getListPrice(), priceItem.get().getListPrice() * itemRequest.getQty(),
                        "MEX", false, 0);
            }

        }
        return itemReponse;
    }

 // CREATE OR POST - Method to create single priceItem
    @Override
    public Mono<PriceItemDAO> addPriceItemToDb(Mono<PriceItemDAO> priceItemDAOMono) {
    	System.out.println("Entering in addPriceItem()...");
    	return null;
    	//return priceItemDAOMono.map(PricingServiceImpl :: monoToDao)
    			//.flatMap(priceRepository::save);
    }

  

	
}
