import org.junit.Test;

import com.foo.bar.TestedClass;

import static org.junit.Assert.*;

/**
 * Created by michaelhilton on 5/1/17.
 */
public class CanaryTest {

	@Test
	public void myNewTest() throws Exception {
		TestedClass.baz();
		new Canary().m3();
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
