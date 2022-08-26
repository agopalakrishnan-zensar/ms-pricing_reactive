package com.pricing.controller;

import com.pricing.bean.PriceModel;
import com.pricing.data.PriceItemDAO;
//import com.pricing.data.PriceItemDAO1;
import com.pricing.service.PricingService;

import io.swagger.v3.oas.annotations.Operation;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class PricingContoller {

    private PricingService pricingService;

    public PricingContoller(PricingService pricingService){
        this.pricingService = pricingService;
    }

    @PostMapping("/priceItems" )
    public Mono<PriceModel> priceItems(@RequestBody PriceModel model){
        return Mono.just(pricingService.calcultePriceForItems(model));
    }

    /*
	@PostMapping("/addPriceItem1")
	public void addPriceItem1(@RequestBody PriceItemDAO1 priceItemDAO){ 
		pricingService.addPriceItemToDb(priceItemDAO); 
	}*/
	 
    
    
    
    //getPriceItemBySku
    //addPriceItem
    //updatePriceItem
    //removePriceItemBySkuId
    
    //getPriceItemBySkuReactive
    //addPriceItemReactive
    //updatePriceItemReactive
    //removePriceItemBySkuIdReactive
    
    
    @PostMapping("/addPriceItem")
    public Mono<PriceItemDAO> addPriceItem(@RequestBody Mono<PriceItemDAO> priceItemDAO){
    	System.out.println("Entering in addPriceItem()...");
        return pricingService.addPriceItemToDb(priceItemDAO);
    }
    
    
    
}
