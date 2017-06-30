import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void test() {
		SpellCheck s = new SpellCheck();
		assertTrue(s.check("My dog has a name leggggggo he is such a gooooood boy") == 2);
	}
	

}
