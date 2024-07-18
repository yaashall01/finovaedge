package com.yaashall.customer;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Yassine CHALH
 */
public interface CustomerRepository extends JpaRepository<Customer, String> {
}
