package org.example.benchmark;

import org.example.hash.Hash;
import org.example.hash.HashAlgorithm;
import org.example.hash.KeyedHashAlgorithm;
import org.openjdk.jmh.annotations.*;

import java.security.SecureRandom;
import java.util.Base64;

@State(Scope.Benchmark)
public class ExecutionPlan {
    private final SecureRandom random = new SecureRandom();

    @Param({"MD5", "SHA-1", "SHA-224", "SHA-256", "HmacSHA224", "HmacSHA256"})
    public String algorithm;

    public Hash hash;
    public byte[] pepper;
    public String value;

    @Setup(Level.Trial)
    public void init() {
        setValue();
        setPepper();
        setHash();
    }

    private void setValue() {
        byte[] out = new byte[16 / 4 * 3];
        random.nextBytes(out);
        value = Base64.getEncoder().encodeToString(out); // it will result into 16 char string
    }

    private void setPepper() {
        pepper = new byte[256/8];
        random.nextBytes(pepper);
    }

    private void setHash() {
        if(algorithm.startsWith("Hmac")){
            hash = new KeyedHashAlgorithm(algorithm, pepper);
        } else {
            hash = new HashAlgorithm(algorithm, pepper);
        }
    }
}
