package com.getsure.service;
import java.util.List;
import com.getsure.entities.Product;

public interface IProductService {

	Integer saveProduct(Product p); //save
	void updateProduct(Product p); //update
	void deleteProduct(Integer id); //delete
	Product findOneProduct(Integer id); //getOne
	List<Product> findAllProducts(); //getAll

}