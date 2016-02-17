package com.myretail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myretail.model.Product;
import com.myretail.service.ProductService;

@RestController
public class ProductController {
	
    @Autowired
	private ProductService productService;
	
	@RequestMapping("/product/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") Long productId){
		
		Product product = productService.getProduct(productId);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
		
		
	}

}
