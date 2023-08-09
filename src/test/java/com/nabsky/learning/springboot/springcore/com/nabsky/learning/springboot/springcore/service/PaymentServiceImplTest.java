package com.nabsky.learning.springboot.springcore.com.nabsky.learning.springboot.springcore.service;

import com.nabsky.learning.springboot.springcore.service.PaymentService;
import com.nabsky.learning.springboot.springcore.service.PaymentServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PaymentServiceImplTest {

    @Autowired
    private PaymentService paymentService;
    @Autowired
    private PaymentServiceImpl paymentServiceImpl;

    @Test
    public void paymentServiceShouldBeAvailable() {
        assertNotNull(paymentService);
    }

    @Test
    public void paymentDaoInPaymentServiceShouldBeAvailable() {
        assertNotNull(paymentServiceImpl.getPaymentDAO());
    }

}
