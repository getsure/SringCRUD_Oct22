package com.getsure.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getsure.entities.Product;
import com.getsure.repo.ProductRepository;
import com.getsure.service.IProductService;
import com.getsure.util.ProductUtil;

@Service //its very important
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public Integer saveProduct(Product p) {
		//ProductUtil.calculateProdDisc(p);
		repo.save(p);
		return p.getId();
	}

	@Override
	public void updateProduct(Product p) {
		//ProductUtil.calculateProdDisc(p);
		repo.save(p);
	}

	@Override
	public void deleteProduct(Integer id) {
		repo.deleteById(id);

	}

	@Override
	public Product findOneProduct(Integer id) {
		Optional<Product> opt= repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Product> findAllProducts() {
		return repo.findAll();
	}

}
