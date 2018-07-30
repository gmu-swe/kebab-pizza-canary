import static org.junit.Assert.*;

import org.junit.Test;


public class FlakyTest {

	int f;
	@Test
	public void testRandom() throws Exception {
		double d = Math.random();
		System.out.println("How lucky are we feeling?");
		if(d<0.5)
			fail("We weren't lucky enough!");
	}
	
	@Test
	public void testRandom2() throws Exception {
		double d = Math.random();
		if(d<0.5)
			fail("We weren't lucky enough!");
	}

	@Test
	public void testRandom3() throws Exception {
		double d = Math.random();
		System.out.println("How lucky are we feeling?");
		if(d<0.5)
			fail("We weren't lucky enough!");
	}
	
	@Test
	public void testRandom4() throws Exception {
		double d = Math.random();
		System.out.println("How lucky are we feeling?");
		if(d<0.5)
			fail("We weren't lucky enough!");
	}
	
	@Test
	public void testRandom5() throws Exception {
		double d = Math.random();
		System.out.println("How lucky are we feeling?");
		if(d<0.5)
			fail("We weren't lucky enough!");
	}
	
	@Test
	public void testRandom6() throws Exception {
		double d = Math.random();
		System.out.println("How lucky are we feeling?");
		if(d<0.5)
			fail("We weren't lucky enough!");
	}
	
	@Test
	public void testDeterministic() throws Exception {
		System.out.println("This change shouldnt change the test outcome! ");
	}
}
