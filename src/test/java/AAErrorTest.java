import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AAErrorTest {

	@Category(FlakyAnno.class)
	@Test
	public void testOne() throws Exception {
		fail();
	}
	@Category(FlakyAnno.class)
	@Test
	public void testOne2() throws Exception {
		fail();
	}
//
//	@Test
//	public void testOne3() throws Exception {
//
//	}
//
//	@Test
//	public void testOne4() throws Exception {
//
//	}
//
//	@Test
////	@Ignore
//	public void testOne5() throws Exception {
//
//	}
//	@Test
//	public void testOne6() throws Exception {
//
//	}

	static int n;
	@BeforeClass
	public static void badBefore() {
		n++;
		if(n > 1)
		throw new NullPointerException();
	}
}
