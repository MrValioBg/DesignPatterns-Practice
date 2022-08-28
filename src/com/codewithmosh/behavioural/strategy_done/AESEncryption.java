package com.codewithmosh.behavioural.strategy_done;

public class AESEncryption implements EncryptionAlgorithm {
    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting message using AES");
        return "encrypted message";
    }
}
