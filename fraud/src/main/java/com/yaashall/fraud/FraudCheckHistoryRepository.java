package com.yaashall.fraud;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Yassine CHALH
 */
public interface FraudCheckHistoryRepository extends MongoRepository<FraudCheckHistory, Long> {
}
