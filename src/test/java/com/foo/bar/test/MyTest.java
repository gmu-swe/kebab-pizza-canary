package com.foo.bar.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.foo.bar.NewClass;
import com.foo.bar.TestedClass;

public class MyTest {
	@Test
	public void testSomething() throws Exception {
		new TestedClass();
	}
	
	@Test
	public void testNewTest() throws Exception {
		new NewClass().newMethod();
	}
}
