package com.myretail.controller;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myretail.model.Product;

@RestController
public class ProductController {
	
	@RequestMapping("/product/{id}")
	public ResponseEntity<Product> getProduct(@PathParam("id") long productId){
		
		return null;
	}

}
