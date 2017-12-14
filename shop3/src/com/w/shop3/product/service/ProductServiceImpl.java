package com.w.shop3.product.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.w.shop3.entiy.Product;
import com.w.shop3.entiy.ProductType;
import com.w.shop3.product.dao.ProductDAOImpl;

@Service
@Transactional
public class ProductServiceImpl {

	@Resource
	private ProductDAOImpl pdi;
	private int pageSize = 6;
	
	/**
	 * 得到全部商品分页的商品列表
	 * @param pageNo
	 * @return
	 */
	public List<Product> pageList(int pageNo) {
		return this.pdi.pageList(pageNo);
	}
	
	/**
	 * 得到全部商品的可分页数
	 * @return
	 */
	public int getPageCount() {
		int proCount = this.pdi.getPageCount();
		int pageCount = 0;
		if(proCount % pageSize == 0) {
			pageCount = proCount / pageSize;
		}
		if(proCount % pageSize != 0) {
			pageCount = proCount / pageSize + 1;
		}
		return pageCount;
	}
	
	/**
	 * 条件查询的列表
	 * @param typeId
	 * @param pageNo
	 * @return
	 */
	public List<Product> selectByCondition(int typeId,int pageNo) {
		return this.pdi.selectByCondition(typeId,pageNo);
	}
	
	/**
	 * 条件查询的分页页数
	 * @param typeId
	 * @return
	 */
	public int getTypeCount(int typeId) {
		int proCount = this.pdi.getTypeCount(typeId);
		int pageCount = 0;
		if(proCount % pageSize == 0) {
			pageCount = proCount / pageSize;
		}
		if(proCount % pageSize != 0) {
			pageCount = proCount / pageSize + 1;
		}
		return pageCount;
	}
	
	/**
	 * 得到商品详情
	 * @param productId
	 * @return
	 */
	public Product getSingleDetails(int productId) {
		return this.pdi.getSingleDetails(productId);
	}
	
	/**
	 * 根据商品名称查询商品
	 * @param productName
	 * @return
	 */
	public Product getProductByName(String productName) {
		return this.pdi.getProductByName(productName);
	}

	/**
	 * 后台得到全部商品
	 * @return
	 */
	public List<Product> getAll() {
		return this.pdi.getAll();
	}
	
	/**
	 * 后台添加商品
	 * @param p
	 * @param type
	 */
	public void addProduct(Product p,int type) {
		ProductType pt = this.pdi.addProductToType(type);
		this.pdi.addProduct(p,pt);
	}

	/**
	 * 后台根据Id得到商品
	 * @param pId
	 * @return
	 */
	public Product getProductById(int pId) {
		return this.pdi.getProductById(pId);
	}
	
	/**
	 * 后台删除某商品
	 * @param p
	 */
	public void deleteSomeone(Product p) {
		this.pdi.deleteSomeome(p);
	}
	
	/**
	 * 后台更新某商品信息
	 * @param p
	 * @param singlePrice
	 * @param cut
	 */
	public void updateSingle(Product p,double singlePrice,double cut) {
		this.pdi.updateSingle(p,singlePrice,cut);
	}

}
