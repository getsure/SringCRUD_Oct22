package com.getsure.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.getsure.entities.Product;
import com.getsure.service.IProductService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/product")
public class ProductRestController {

	@Autowired
	private IProductService service;

	// save
	@PostMapping("/create")
	public ResponseEntity<String> saveProduct(@RequestBody Product product) {
		Integer id = service.saveProduct(product);
		String body = "Product saved with id " + id;
		return ResponseEntity.ok(body);
	}

	// update
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateProduct(@RequestBody Product product) {
		service.updateProduct(product);
		String body = "Product updated " + product.getId();
		return ResponseEntity.ok(body);
	}

	// delete
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable Integer id) {
		service.deleteProduct(id);
		String body = "Product deleted " + id;
		return ResponseEntity.ok(body);
	}

	// fetchOne
	@GetMapping("/one/{id}")
	public ResponseEntity<Product> getOneProduct(@PathVariable Integer id) {
		Product p = service.findOneProduct(id);
		return ResponseEntity.ok(p);
	}

	// fetchAll
	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> list = service.findAllProducts();
		return ResponseEntity.ok(list);
	}
}
