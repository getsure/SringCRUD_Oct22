package com.getsure.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="prod_tab")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pid")
	private Integer id;
	
	@Column(name="pname")
	private String productName;

//	@Column(name="pcost")
//	private Double productPrice;
//	
////    @Column(name="pvendor")
////    private String prodVendor;
//    
//    @Column(name="pdisc")
//    private Double prodCostDisc;
//    
//    @Column(name="pgst")
//    private Double prodCostGst;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

//	public Double getProductPrice() {
//		return productPrice;
//	}
//
//	public void setProductPrice(Double productPrice) {
//		this.productPrice = productPrice;
//	}
//
//	public Double getProdCostDisc() {
//		return prodCostDisc;
//	}
//
//	public void setProdCostDisc(Double prodCostDisc) {
//		this.prodCostDisc = prodCostDisc;
//	}
//
//	public Double getProdCostGst() {
//		return prodCostGst;
//	}
//
//	public void setProdCostGst(Double prodCostGst) {
//		this.prodCostGst = prodCostGst;
//	}
//    
    
    
}