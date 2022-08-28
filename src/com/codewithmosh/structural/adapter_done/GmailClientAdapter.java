package com.codewithmosh.structural.adapter_done;

import com.codewithmosh.structural.adapter_done.Gmail.GmailClient;

public class GmailClientAdapter implements EmailProvider {

    private final GmailClient client;

    public GmailClientAdapter(GmailClient client) {
        this.client = client;
    }

    @Override
    public void downloadEmails() {
        client.connect();
        client.getEmails();
        client.disconnect();
    }
}
