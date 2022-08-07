import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class SubCalculator  {

	@Test
	void test() {
		Calculator c = new Calculator();
		assertEquals(10,c.sub(30,20));
}
}
