package org.javacodegeeks;

import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

public class BenchMark {

    @Benchmark
	@Fork(value = 1, warmups = 2)
	@BenchmarkMode(Mode.Throughput)
	public void init() {
	    // Do nothing
	}

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    public int op1() {
        int i = 8;

        int op1 =  2 * i * i;
		
		return op1;
    }
	
    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    public int op2() {
        int i = 8;

        int op2 =  2 * (i * i);
		
		return op2;
    }



}
