package testEvenOdd;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {
	private Addition addition;

	/** * Initialization */
	@Before
	public void setUp() {
		addition = new Addition();
	}

	/** * Test case for add method */
	@Test
	public void test() {
		String i = addition.add();
		assertEquals("Hello World Changed!!!", i);
	}

	/** * destroy the object */
	@After
	public void tearDown() {
		addition = null;
	}
}