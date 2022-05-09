package com.programming.techie.springredditclone.service;

import com.programming.techie.springredditclone.model.NotificationEmail;

public interface MailService {

    void sendMail(NotificationEmail notificationEmail);
}
