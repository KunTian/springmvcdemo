/**
 * 
 */
package com.spring.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.dao.IPersonDao;
import com.spring.demo.model.Person;
import com.spring.demo.service.IPersonService;

/**
 * @date 2017年7月31日 下午3:39:44
 * @author tiankun
 * 
 */
@Service
public class PersonServiceImpl implements IPersonService {
	
	@Autowired
	IPersonDao dao;
	
	@Override
	public List<Person> getAll() {
		return dao.getAll();
	}

}
