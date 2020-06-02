package com.dt.springcloud.Service.impl;

import com.dt.springcloud.Service.PaymentService;
import com.dt.springcloud.dao.PaymentDao;
import com.dt.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    public  int create(Payment payment){
        return  paymentDao.create(payment);
    }

    public  Payment getPaymentById( Long id){
        return  paymentDao.getPaymentById(id);
    }
}
