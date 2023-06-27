package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entites.CommonResult;

import com.atguigu.springcloud.entites.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
@RequestMapping("/consumer")
public class ConsumerController {

    //远程调用地址
    private static final String URL="http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public CommonResult add(Payment payment){
        CommonResult commonResult = restTemplate.postForObject(URL + "/payment/addPayment", payment, CommonResult.class);
        return commonResult;
    }

    @GetMapping("/getById/{id}")
    public CommonResult getById(@PathVariable Long id){
        CommonResult result=restTemplate.getForObject(URL + "/payment/getPaymentById/" + id, CommonResult.class);
        return result;
    }
}
