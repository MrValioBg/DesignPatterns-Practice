package com.codewithmosh.structural.adapter_done;

import com.codewithmosh.structural.adapter_done.Gmail.GmailClient;

public class Demo {

    public static void show() {

        var emailClient = new EmailClient();

        emailClient.addProvider(new GmailClientAdapter(new GmailClient()));
        emailClient.downloadEmails();
    }
}
