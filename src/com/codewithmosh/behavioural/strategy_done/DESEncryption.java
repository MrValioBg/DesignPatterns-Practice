package com.codewithmosh.behavioural.strategy_done;

public class DESEncryption implements EncryptionAlgorithm {
    @Override
    public String encrypt(String message) {
        System.out.println("Encrypting message using DES");
        return "encrypted message";
    }
}
