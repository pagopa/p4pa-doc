package org.example.hash;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class KeyedHashAlgorithm implements Hash {

    private final String algorithm;
    private final byte[] key;

    public KeyedHashAlgorithm(String algorithm, byte[] key) {
        this.algorithm = algorithm;
        this.key = key;
    }

    private Mac getInstance() {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, algorithm);
            Mac mac = Mac.getInstance(algorithm);
            mac.init(secretKeySpec);
            return mac;
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new IllegalStateException("Algorithm not available", e);
        }
    }

    public byte[] apply(String s) {
        Mac mac = getInstance();
        mac.update(s.getBytes());
        return mac.doFinal();
    }

}
