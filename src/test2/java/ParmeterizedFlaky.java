import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ParmeterizedFlaky {

	
	@Parameters
	public static Iterable<? extends Object> data() {
	    return Arrays.asList("first test", "second test");
	}
	
	public ParmeterizedFlaky(String v)
	{
		System.out.println("Param " + v);
	}
	@Test
	public void testBad() throws Exception {
		double d = Math.random();
		if(d<0.5)
			fail("boo");
	}
	@Test
	public void testBad2() throws Exception {
		double d = Math.random();
		if(d<0.5)
			fail("boo");
	}
}
