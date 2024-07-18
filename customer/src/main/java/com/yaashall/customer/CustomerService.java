package com.yaashall.customer;

import com.yaashall.clients.fraud.FraudCheckResponse;
import com.yaashall.clients.fraud.FraudClient;
import com.yaashall.clients.notification.NotificationClient;
import com.yaashall.clients.notification.NotificationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Yassine CHALH
 */
@Service
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;
    private final FraudClient fraudClient;
    private final NotificationClient notificationClient;

    public CustomerService(CustomerRepository customerRepository, RestTemplate restTemplate, FraudClient fraudClient, NotificationClient notificationClient) {
        this.customerRepository = customerRepository;
        this.restTemplate = restTemplate;
        this.fraudClient = fraudClient;
        this.notificationClient = notificationClient;
    }

    public void registerCustomer(CustomerRegisterRequest request){

        // TODO: check if email not token
        Customer customer = Customer.builder()
                .name(request.name())
                .phoneNumber(request.phoneNumber())
                .email(request.email())
                .address(request.address())
                .build();
        customerRepository.saveAndFlush(customer);


        // TODO: check if fraudster
//        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
//                "http://FRAUD/api/v1/fraud-check/{customerId}"
//                ,FraudCheckResponse.class
//                ,customer.getId()
//        );

        FraudCheckResponse fraudCheckResponse = fraudClient.isFraudster(customer.getId());

        if (fraudCheckResponse.isFraudulentCustomer()){
            throw new IllegalStateException("This is a Fraudster");
        }

        // TODO: send notification
        NotificationRequest notificationRequest = new NotificationRequest(
                customer.getId(),
                customer.getEmail(),
                "TEST TESTTESTTESTTEST"
        );

        notificationClient.sendNotification(notificationRequest);



    }
}
