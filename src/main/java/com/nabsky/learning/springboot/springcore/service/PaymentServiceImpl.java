package com.nabsky.learning.springboot.springcore.service;

import com.nabsky.learning.springboot.springcore.dao.PaymentDAO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    @Getter
    @Setter
    private PaymentDAO paymentDAO;

}