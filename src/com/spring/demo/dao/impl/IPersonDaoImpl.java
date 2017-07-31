/**
 * 
 */
package com.spring.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.demo.dao.IPersonDao;
import com.spring.demo.model.Person;

/**
 * @date 2017年7月31日 下午3:41:59
 * @author tiankun
 * 
 */
@Repository
public class IPersonDaoImpl implements IPersonDao{

	@Override
	public List<Person> getAll() {
		List<Person> list = new ArrayList<Person>();
		
		Person p1 = new Person();
		p1.setId(1);
		p1.setFullName("张三");
		p1.setCountry("China");
		list.add(p1);
		
		Person p2 = new Person();
		p2.setId(2);
		p2.setFullName("John");
		p2.setCountry("USA");
		list.add(p2);
		
		return list;
	}

}
