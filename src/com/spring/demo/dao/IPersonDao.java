/**
 * 
 */
package com.spring.demo.dao;

import java.util.List;

import com.spring.demo.model.Person;

/**
 * @date 2017��7��31�� ����3:40:36
 * @author tiankun
 * 
 */
public interface IPersonDao {
	
	List<Person> getAll();
	
}
