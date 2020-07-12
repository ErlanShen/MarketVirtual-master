package com.Equipe.Dynamite.virtual.market.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Equipe.Dynamite.virtual.market.Dtos.ProductDto;

@RestController
@RequestMapping(ProductResource.PRODUCT)
public class ProductResource {
	
	public static final String PRODUCT ="/product";
	public static final String ID ="/{id}";
	
	@Autowired
	private ProductController productController;
	
	@PostMapping
	public vid createProduct(@Validated @RequestBody ProductDto productDto)throws ProductCreateEroor{
		this.productController.createProduct(producDto);
	}

}
