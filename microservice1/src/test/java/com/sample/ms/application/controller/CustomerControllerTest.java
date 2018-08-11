//package com.sample.ms.application.controller;
//
//import com.sample.ms.application.model.Customer;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
///**
// * Integration test to execute controller
// */
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class CustomerControllerTest {
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Test
//    public void getCustomerDetailsTest() {
//        Customer body = this.restTemplate.getForObject("/customer/1", Customer.class);
//        System.out.println(body);
//        assertThat(body.getName()).isEqualTo("Riya");
//    }
//
//}
