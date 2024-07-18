package com.yaashall.fraud;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * @author Yassine CHALH
 */

@Data
@Document(collection = "transactions")
public class Transaction {

    @Id
    private String id;
    private String customerId;
    private double amount;
    private String type;
    private boolean isFraudulent;
    private FraudCheckHistory fraudCheckHistory;
    private LocalDateTime createdAt;
}
