package com.atguigu.springcloud.service;


import com.atguigu.springcloud.entites.Payment;

public interface PaymentService {

    public int add(Payment payment);

    public Payment getById(Long id);
}
