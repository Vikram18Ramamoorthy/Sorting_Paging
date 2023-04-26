package com.example.demo.ServicePage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

//import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Model.PojoPage;
import com.example.demo.Repository.RepositoryPage;
@Service
public class sercla {
	@Autowired
	RepositoryPage repobj;
//post
	public String addProduct(PojoPage pojoobj)
	{
		repobj.save(pojoobj);
		return "Posted";
	}
//get
	public List<PojoPage>getProduct()
	{
		return repobj.findAll();
	}
	
	//sort
//	public List<PojoPage> getProductDetails(String field) {
//		// TODO Auto-generated method stub
//		return repobj.findAll(Sort.by(Sort.Direction.DESC, field));
//		}

	//pagination
	public List<PojoPage> getProductwithpaging(int offset, int pagesize) {
		// TODO Auto-generated method stub
		Page<PojoPage> pojoobj=repobj.findAll(PageRequest.of(offset,pagesize));
		return pojoobj.getContent();
	}



}
