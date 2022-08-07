import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ElevatorTest {

	@Test
	void test() {
		Elevator e = new Elevator();
		assertEquals("Reached Destination",e.goUpward(5, 4,0));
	}

}
