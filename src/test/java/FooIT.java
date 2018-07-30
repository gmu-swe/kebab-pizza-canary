import static org.junit.Assert.*;

import org.junit.Test;

public class FooIT{

	class baz{
		void foo()
		{
			System.out.println(FooIT.this.getClass());
		}
	}
	void b()
	{
		new baz().foo();
	}
	public static void main(String[] args) {
		new FooIT().b();
	}
	@Test
	public void testTest() throws Exception {
		System.out.println("woo");
	}
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
}
