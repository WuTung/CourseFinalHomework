package com.w.shop3.product.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.w.shop3.entiy.Product;
import com.w.shop3.entiy.ProductType;

@Repository
public class ProductDAOImpl {

	@Resource
	private SessionFactory sf;
	
	private int pageSize = 6;
	
	/**
	 * 得到分页查询所有商品
	 * @param pageNo
	 * @return
	 */
	public List<Product> pageList(int pageNo) {
		Query q1 = this.sf.getCurrentSession().createQuery("from Product");
		List<Product> pList = q1.setFirstResult((pageNo-1)*pageSize).setMaxResults(pageSize).list();
		return pList;
	}
	
	/**
	 * 得到全部商品分页所需页数
	 * @return
	 */
	public int getPageCount() {
		Query q = this.sf.getCurrentSession().createQuery("select COUNT(p) from Product p");
		Number prCount = (Number) q.uniqueResult();
		int proCount = prCount.intValue();
		return proCount;
	}
	
	/**
	 * 分类查找商品并分页
	 * @param typeId
	 * @param pageNo
	 * @return
	 */
	public List<Product> selectByCondition(int typeId,int pageNo) {
		Query q = this.sf.getCurrentSession().createQuery("from ProductType where typeId = :typeId");
		q.setParameter("typeId", typeId);
		ProductType pt = (ProductType) q.uniqueResult();
		Query q2 = this.sf.getCurrentSession().createQuery("from Product where productType = :productType");
		q2.setParameter("productType", pt);
		List<Product> selectList = q2.setFirstResult((pageNo-1)*pageSize).setMaxResults(pageSize).list();
		return selectList;			
	}
	
	/**
	 * 得到按类型分类的商品页数
	 * @param typeId
	 * @return
	 */
	public int getTypeCount(int typeId) {
		Query q = this.sf.getCurrentSession().createQuery("from ProductType where typeId = :typeId");
		q.setParameter("typeId", typeId);
		ProductType pt = (ProductType) q.uniqueResult();
		Query q2 = this.sf.getCurrentSession().createQuery("select COUNT(p) from Product p where productType = :productType");
		q2.setParameter("productType", pt);
		Number proCount = (Number) q2.uniqueResult();
		int prCount = proCount.intValue();
		return prCount;
	}
	

	/**
	 * 查询某商品的详情
	 * @param productId
	 * @return
	 */
	public Product getSingleDetails(int productId) {
		Query q = this.sf.getCurrentSession().createQuery("from Product p where productId = ?");
		q.setParameter(0, productId);
		Product product = (Product) q.uniqueResult();
		return product;
	}
	
	/**
	 * 通过商品名称得到商品信息
	 * @param productName
	 * @return
	 */
	public Product getProductByName(String productName) {
		Query q = this.sf.getCurrentSession().createQuery("from Product p where productName =:productName");
		q.setParameter("productName", productName);
		Product p = (Product) q.uniqueResult();
		return p;
	}
	
	/**
	 * 后台得到所有商品（不分页）
	 * @return
	 */
	public List<Product> getAll() {
		Query q = this.sf.getCurrentSession().createQuery("from Product");
		List<Product> pList = q.list();
		return pList;
	}
	
	/**
	 * 后台添加商品
	 * @param p
	 * @param pt
	 */
	public void addProduct(Product p,ProductType pt) {
		pt.getpSet().add(p);
		p.setProductType(pt);
		this.sf.getCurrentSession().save(p);
	}
	
	/**
	 * 得到商品类型信息
	 * @param type
	 * @return
	 */
	public ProductType addProductToType(int type) {
		Query q = this.sf.getCurrentSession().createQuery("from ProductType where typeId = ?");
		q.setParameter(0, type);
		ProductType pt = (ProductType) q.uniqueResult();
		return pt;
	}
	
	/**
	 * 后台通过Id查询商品
	 * @param pId
	 * @return
	 */
	public Product getProductById(int pId) {
		Query q = this.sf.getCurrentSession().createQuery("from Product where productId = ?");
		q.setParameter(0, pId);
		Product p = (Product) q.uniqueResult();
		return p;
	}
	
	/**
	 * 后台删除某商品
	 * @param p
	 */
	public void deleteSomeome(Product p) {
		ArrayList<Product> pList = new ArrayList<Product>(p.getProductType().getpSet());
		for(int i = 0;i < pList.size();i ++) {
			if(pList.get(i).getProductId() == p.getProductId()) {
				pList.remove(pList.get(i));
				this.sf.getCurrentSession().delete(p);
				i--;
			}
		}
	}
	
	/**
	 * 后台更新某个商品的信息
	 * @param p
	 * @param singlePrice
	 * @param cut
	 */
	public void updateSingle(Product p,double singlePrice,double cut) {
		p.setCut(cut);
		p.setSinglePrice(singlePrice);
		this.sf.getCurrentSession().update(p);
	}

}
