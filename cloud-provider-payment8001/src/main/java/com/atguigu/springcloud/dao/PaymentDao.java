package com.atguigu.springcloud.dao;


import com.atguigu.springcloud.entites.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    //增加
    public int create(Payment payment);

    //查询
    public Payment getPaymentById(@Param("id") Long id);
}
