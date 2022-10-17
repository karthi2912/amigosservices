package com.amigoscode.notification;

import com.amigoscode.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void sendNotification(NotificationRequest notificationRequest){
        Notification notification = Notification.builder()
                                .customerId(notificationRequest.customerId())
                                .toCustomerEmail(notificationRequest.toCustomerEmail())
                                .sender("amigoscode")
                                .message(notificationRequest.message())
                                .sentAt(LocalDateTime.now())
                                .build();

        notificationRepository.save(notification);
    }
}
