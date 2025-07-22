package ru.acedemy.onlinestore.service.implementations;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import ru.acedemy.onlinestore.model.entity.Product;
import ru.acedemy.onlinestore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> getProducts() {
		Random random = new Random();
		List<Product> products = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			Product product = new Product();
			product.setId(i);
			product.setName("Товар #" + i);
			product.setDescription("Описание для товара №" + i);
			product.setPrice(new BigDecimal(random.nextInt(100, 1_000_000)));
			
			products.add(product);
		}
		
		return products;
	}
}
