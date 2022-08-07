import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCaseOfMarks {

	@Test
	void test() {
		ExamMarks obj = new ExamMarks(0.00,0.00,0.00);
		assertEquals("failed",obj.getResults(30.00, 10.00, 20.00));
		
	}

}
