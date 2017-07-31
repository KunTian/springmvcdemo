/**
 * 
 */
package com.spring.demo.dao;

import java.util.List;

import com.spring.demo.model.Person;

/**
 * @date 2017年7月31日 下午3:40:36
 * @author tiankun
 * 
 */
public interface IPersonDao {
	
	List<Person> getAll();
	
}
