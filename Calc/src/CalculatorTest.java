import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator c = new Calculator();
		assertEquals(30,c.add(10,20));
	}

}
