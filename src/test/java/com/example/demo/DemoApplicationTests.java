package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	public class ObjectWithNonPureFunction{
	    private int value = 0;

	    public int add(int nextValue) {
	        this.value += nextValue;
	        return this.value;
	    }
	}

}
