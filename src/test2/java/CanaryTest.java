import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by michaelhilton on 5/1/17.
 */
public class CanaryTest {

	@Test
	public void myNewTest() throws Exception {
//		new Canary().m3();
		foo();
	}
	
	public static Object foo()
	{
		return new ArrayList(
				Collections.
				singleton( 
						new Boolean("b" != null)
						)
						);
	}
    @Test
    public void myFirstTest() {
    	new Canary().main(null);
        assertEquals(2, 1 + 1);
    }

    @Test
    public void mySecondTest() {
Canary.m2();
        assertEquals(2, 3-1);
    }

}
