package com.myretail.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.myretail.model.Currency;
import com.myretail.model.Money;
import com.myretail.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public Product getProduct(Long productId) {
		
		Product product = new Product();
		product.setId(productId);
		product.setName("Iphone 6");
		product.setPrice(new Money(new BigDecimal(100.0),Currency.USD));
		return product;
	}

}
