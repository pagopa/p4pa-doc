package org.example.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashAlgorithm implements Hash {

    private final String algorithm;
    private final byte[] pepper;

    public HashAlgorithm(String algorithm, byte[] pepper) {
        this.algorithm = algorithm;
        this.pepper = pepper;
    }

    private MessageDigest getInstance() {
        try {
            return MessageDigest.getInstance(algorithm);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("Algorithm not available", e);
        }
    }

    public byte[] apply(String s) {
        MessageDigest md = getInstance();
        md.update(s.getBytes());
        md.update(pepper);
        return md.digest();
    }

}
