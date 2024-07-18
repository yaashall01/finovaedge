package com.yaashall.notification;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Yassine CHALH
 */
public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
