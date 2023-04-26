package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.PojoPage;
import com.example.demo.ServicePage.sercla;

@RestController
@RequestMapping("/abc")
public class ControllerPage {
	@Autowired
	sercla serobj;
	
	@PostMapping("")
	public String addProduct(@RequestBody PojoPage pojoobj)
	{
		return serobj.addProduct(pojoobj);
	}
	
	
	@GetMapping("")
	public List<PojoPage>read()
	{
		return serobj.getProduct();
	}
	
	//Sorting
//	@GetMapping("/product/{field}")
//	public List<PojoPage>getProductsSorted(@PathVariable String field)
//	{
//		return serobj.getProductDetails(field);
//	}
	
	//pagination
		@GetMapping("/product/{offset}/{pagesize}")
		public List<PojoPage> getProductswithPagination(@PathVariable int offset, @PathVariable int pagesize)
		{
			return serobj.getProductwithpaging(offset, pagesize);
		}
	
	
}
