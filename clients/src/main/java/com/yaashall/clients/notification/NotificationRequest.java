package com.yaashall.clients.notification;

/**
 * @author Yassine CHALH
 */
public record NotificationRequest(
        String toCustomerId,
        String toCustomerName,
        String message
) {

}
