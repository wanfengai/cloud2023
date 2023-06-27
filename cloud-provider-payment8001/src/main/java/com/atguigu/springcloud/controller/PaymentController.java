package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entites.CommonResult;
import com.atguigu.springcloud.entites.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/payment/")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @PostMapping("/addPayment")
    public CommonResult add(@RequestBody Payment payment){

        int rel = paymentService.add(payment);
        if(rel>0){

            return new CommonResult(200,"添加订单成功");
        }
        return new CommonResult(500,"添加订单失败");

    }

    @GetMapping("/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

        Payment payment = paymentService.getById(id);

        if(payment!=null){

            return new CommonResult<>(200,"查询成功",payment);
        }

        return new CommonResult<>(404,"查询失败，该订单不存在");
    }
}
