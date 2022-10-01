package com.getsure.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.getsure.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	// dynamic proxy class for insert,get, getAll, delete...etc operations
	// custom queries we have to use @Query
	//@Modifying
	//@Query("UPDATE Product SET prodVendor=:vendor WHERE prodId=:id")
	//int updateProductVendor(String vendor, Integer id);
}