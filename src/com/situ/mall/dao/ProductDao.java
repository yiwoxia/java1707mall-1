package com.situ.mall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.situ.mall.pojo.Product;
import com.situ.mall.vo.FindByCondition;

public interface ProductDao {

	/**
	 * 获得数据库中数量的数量
	 * @return int
	 */
	int totalSzie();

	/**
	 * 进行分页
	 * @param pageIndex
	 * @param pageSize
	 * @return List<Product>
	 */
	List<Product> pageLsit(@Param("pageIndex")Integer pageIndex, @Param("pageSize")Integer pageSize);

	/**
	 * 根据条件查询数据的数量
	 * @param condition
	 * @return int
	 */
	int totalSizeByCondition(FindByCondition condition);

	/**
	 * 根据条件查询数据库的数据
	 * @param condition
	 * @return List<Product>
	 */
	List<Product> pageListByCondition(FindByCondition condition);

}