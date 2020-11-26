package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {

    @Select("select * from product where id=#{id}")
    Product findById(String id) throws Exception;
    //查询所有的产品信息
    @Select("select * from product")
    List<Product> findAll() throws Exception;

    @Insert("insert into product(productNum,productName,departureTime,cityName,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{departureTime},#{cityName},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product);
}
