package org.example.benchmark;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

public class HashAlgorithmBenchmark {

    @Fork(value = 1, warmups = 1)
    @Warmup(iterations = 1, time = 10)
    @Measurement(iterations = 3, time = 60)
    @Benchmark
    @BenchmarkMode({Mode.Throughput, Mode.AverageTime})
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void test(ExecutionPlan executionPlan){
        executionPlan.hash.apply(executionPlan.value);
    }
}
