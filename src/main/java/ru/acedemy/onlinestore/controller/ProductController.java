package ru.acedemy.onlinestore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.acedemy.onlinestore.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping
	public String allProducts(Model model) {		
		model.addAttribute("products", productService.getProducts());
		return "product/list";
	}
}
