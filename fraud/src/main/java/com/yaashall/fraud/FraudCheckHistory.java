package com.yaashall.fraud;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * @author Yassine CHALH
 */
@Data
@Builder
@Getter
@Setter
@Document(collection = "fraud_check_history")
public class FraudCheckHistory {

    @Id
    private String id;
    private String customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;
}
