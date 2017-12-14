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
	 * �õ�ȫ����Ʒ��ҳ����Ʒ�б�
	 * @param pageNo
	 * @return
	 */
	public List<Product> pageList(int pageNo) {
		return this.pdi.pageList(pageNo);
	}
	
	/**
	 * �õ�ȫ����Ʒ�Ŀɷ�ҳ��
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
	 * ������ѯ���б�
	 * @param typeId
	 * @param pageNo
	 * @return
	 */
	public List<Product> selectByCondition(int typeId,int pageNo) {
		return this.pdi.selectByCondition(typeId,pageNo);
	}
	
	/**
	 * ������ѯ�ķ�ҳҳ��
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
	 * �õ���Ʒ����
	 * @param productId
	 * @return
	 */
	public Product getSingleDetails(int productId) {
		return this.pdi.getSingleDetails(productId);
	}
	
	/**
	 * ������Ʒ���Ʋ�ѯ��Ʒ
	 * @param productName
	 * @return
	 */
	public Product getProductByName(String productName) {
		return this.pdi.getProductByName(productName);
	}

	/**
	 * ��̨�õ�ȫ����Ʒ
	 * @return
	 */
	public List<Product> getAll() {
		return this.pdi.getAll();
	}
	
	/**
	 * ��̨�����Ʒ
	 * @param p
	 * @param type
	 */
	public void addProduct(Product p,int type) {
		ProductType pt = this.pdi.addProductToType(type);
		this.pdi.addProduct(p,pt);
	}

	/**
	 * ��̨����Id�õ���Ʒ
	 * @param pId
	 * @return
	 */
	public Product getProductById(int pId) {
		return this.pdi.getProductById(pId);
	}
	
	/**
	 * ��̨ɾ��ĳ��Ʒ
	 * @param p
	 */
	public void deleteSomeone(Product p) {
		this.pdi.deleteSomeome(p);
	}
	
	/**
	 * ��̨����ĳ��Ʒ��Ϣ
	 * @param p
	 * @param singlePrice
	 * @param cut
	 */
	public void updateSingle(Product p,double singlePrice,double cut) {
		this.pdi.updateSingle(p,singlePrice,cut);
	}

}
