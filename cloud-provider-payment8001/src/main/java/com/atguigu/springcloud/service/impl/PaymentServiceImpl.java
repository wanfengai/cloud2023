package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;

import com.atguigu.springcloud.entites.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int add(Payment payment) {

        int i = paymentDao.create(payment);
        return i;
    }

    @Override
    public Payment getById(Long id) {

        Payment payment = paymentDao.getPaymentById(id);
        return payment;
    }
}
