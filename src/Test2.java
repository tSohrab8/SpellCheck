import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {
	
	@Test
	public void test2() {
		SpellCheck s = new SpellCheck();
		assertFalse(s.check("My dog has a name he is such a gooooood boy") == 5);
	}
	
	@Test
	public void test3() {
		SpellCheck s = new SpellCheck();
		assertTrue(s.check("Words are meant to be spelled correctly") == 0);
	}
}
