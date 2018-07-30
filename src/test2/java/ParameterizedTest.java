import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {

	
	@Parameters
	public static Iterable<? extends Object> data() {
	    return Arrays.asList("file.txt", "other.txt");
	}
	
	public ParameterizedTest(String v)
	{

	}
	@Test
	public void testBad() throws Exception {
		double d = Math.random();
//		if(d<0.5)
			fail("boo");
	}
//	@Test
//	public void testBad2() throws Exception {
//		double d = Math.random();
//		if(d<0.5)
//			fail("boo");
//	}
}
