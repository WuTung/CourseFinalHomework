package com.w.shop3.product.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.w.shop3.entiy.Product;
import com.w.shop3.product.service.ProductServiceImpl;

@Controller
@RequestMapping("products")
public class ProductControllerImpl {

	@Resource
	private ProductServiceImpl psi;
	
	
	/**
	 * 全部商品分页展示
	 * @param pn
	 * @param response
	 * @param session
	 * @throws IOException
	 */
	@RequestMapping("/pageList")
	public void pageList(@RequestParam("pageNo")int pn,HttpServletResponse response,
			HttpServletRequest request,HttpSession session) throws IOException {
		int pageCount = this.psi.getPageCount();
		session.setAttribute("pageCount", pageCount);
		if(pn > pageCount) {
			pn = pageCount;
		}
		if(pn < 1) {
			pn = 1;
		}
		List<Product> pList = this.psi.pageList(pn);
		
		session.setAttribute("pageNo", pn);
		session.setAttribute("pList", pList);
		response.sendRedirect(request.getContextPath() + "/front/products.jsp");
	}
	
	
	/**
	 * 按类型分类的商品分页展示
	 * @param tId
	 * @param pn
	 * @param pageName
	 * @param response
	 * @param session
	 * @throws IOException
	 */
	@RequestMapping("/selectByCondition")
	public void selectByCondition(@RequestParam("typeId")int tId,@RequestParam("pageNo")int pn,
			@RequestParam("pageName")String pageName,HttpServletResponse response,
			HttpServletRequest request,HttpSession session) throws IOException {
		int TypePageCount = this.psi.getTypeCount(tId);
		session.setAttribute("TypePageCount", TypePageCount);
		if(pn > TypePageCount) {
			pn = TypePageCount;
		}
		if(pn < 1) {
			pn = 1;
		}
		List<Product> selectList = this.psi.selectByCondition(tId,pn);
		session.setAttribute("pageNo", pn);
		session.setAttribute("selectList", selectList);
		response.sendRedirect(request.getContextPath() + "/front/" + pageName + ".jsp");
	}
	
	
	/**
	 * 展示商品详情
	 * @param pId
	 * @param session
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/getSingleDetails")
	public void getSingleDetails(@RequestParam("productId")int pId,HttpSession session,
			HttpServletRequest request,HttpServletResponse response) throws IOException {
		Product pd = this.psi.getSingleDetails(pId);
		session.setAttribute("pd", pd);
		response.sendRedirect(request.getContextPath() + "/front/productdetails.jsp");
	}
	
	//得到所有商品
	/**
	 * 后台得到所有商品并分页
	 * @param pn
	 * @param response
	 * @param session
	 * @throws IOException
	 */
	@RequestMapping("/getAll")
	public void getAll(@RequestParam("pageNo")int pn,HttpServletResponse response,
			HttpServletRequest request,HttpSession session) throws IOException {
		int pageCount = this.psi.getPageCount();
		session.setAttribute("pageCount", pageCount);
		if(pn > pageCount) {
			pn = pageCount;
		}
		if(pn < 1) {
			pn = 1;
		}
		List<Product> pList = this.psi.pageList(pn);
		
		session.setAttribute("pageNo", pn);
		session.setAttribute("pList", pList);
		response.sendRedirect(request.getContextPath() + "/backstage/showgoods.jsp");
	}
	
	//添加商品
	/**
	 * 在后台添加商品
	 * @param pn
	 * @param pName
	 * @param type
	 * @param singlePrice
	 * @param cut
	 * @param file1
	 * @param file2
	 * @param file3
	 * @param model
	 * @param response
	 * @param request
	 * @param session
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/addproduct",method=RequestMethod.POST)
	public String addProduct(@RequestParam("pageNo")int pn,@RequestParam("pName")String pName,
			@RequestParam("type")int type,
			@RequestParam("singleprice")double singlePrice,@RequestParam("cut")double cut,
			@RequestParam("img1")MultipartFile file1,@RequestParam("img2")MultipartFile file2,
			@RequestParam("img3")MultipartFile file3,Model model,HttpServletResponse response,
			HttpServletRequest request,HttpSession session) throws IOException {
		if(this.psi.getProductByName(pName) != null) {
			model.addAttribute("nameError", "商品名已存在");
			return "backstage/addsingle";
		}else if(cut < 0 || cut > 1) {
			model.addAttribute("cutError", "请输入大于0小于1的数");
			return "backstage/addsingle";
		}else if(singlePrice < 0) {
			model.addAttribute("priceError", "请输入大于0的数");
			return "backstage/addsingle";
		}else {
			Product p = new Product();
			p.setProductName(pName);
			p.setSinglePrice(singlePrice);
			p.setCut(cut);
			String imgurl = "static\\images\\";
			String img1 = imgurl + file1.getOriginalFilename();
			String img2 = imgurl + file2.getOriginalFilename();
			String img3 = imgurl + file3.getOriginalFilename();
			p.setImg1(img1);
			p.setImg2(img2);
			p.setImg3(img3);
			String rootPath=request.getServletContext().getRealPath("/");
			try {
				FileCopyUtils.copy(file1.getBytes(), new File(rootPath+"/static/images",file1.getOriginalFilename()));
				FileCopyUtils.copy(file2.getBytes(), new File(rootPath+"/static/images",file2.getOriginalFilename()));
				FileCopyUtils.copy(file3.getBytes(), new File(rootPath+"/static/images",file3.getOriginalFilename()));
			} catch (IOException e) {
				e.printStackTrace();
			}
			this.psi.addProduct(p, type);
			this.getAll(pn, response, request, session);
		}
		return null;
	}
	

	/**
	 * 后台删除某个商品
	 * @param pId
	 * @param pn
	 * @param response
	 * @param session
	 * @throws IOException
	 */
	@RequestMapping("/deleteProduct")
	public void deleteProduct(@RequestParam("productId")int pId,@RequestParam("pageNo")int pn,
			HttpServletResponse response,HttpServletRequest request,HttpSession session) throws IOException {
		Product p = this.psi.getProductById(pId);
		this.psi.deleteSomeone(p);
		this.getAll(pn, response, request, session);
	}
	
	
	/**
	 * 后台根据商品Id得到某个商品
	 * @param productId
	 * @param response
	 * @param session
	 * @throws IOException
	 */
	@RequestMapping("/getSingle")
	public void getSingle(@RequestParam("productId")int productId,HttpServletResponse response,
			HttpServletRequest request,HttpSession session) throws IOException {
		Product p = this.psi.getProductById(productId);
		session.setAttribute("p", p);
		response.sendRedirect(request.getContextPath() + "/backstage/updatesingle.jsp");
	}
	

	/**
	 * 后台更新某个商品信息
	 * @param pn
	 * @param pName
	 * @param singlePrice
	 * @param cut
	 * @param session
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/updateSingle")
	public void updateSingle(@RequestParam("pageNo")int pn,@RequestParam("pName")String pName,
			@RequestParam("singleprice")double singlePrice,@RequestParam("cut")double cut,
			HttpSession session,HttpServletResponse response,HttpServletRequest request) throws IOException {
		Product p = this.psi.getProductByName(pName);
		this.psi.updateSingle(p,singlePrice,cut);
		this.getAll(pn, response, request, session);
	}
	
}
