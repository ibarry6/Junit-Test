import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	GradeBook g1;
	
	@BeforeEach
	void setUp() throws Exception {
		 g1 = new GradeBook(5);

         g1.addScore(50.0);

         g1.addScore(75.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		 g1 = null;
	}

	@Test
	void testAddScore() {
		//fail("Not yet implemented");
		 assertTrue(g1.toString().equals("50.0 75.0 "));
	}

	@Test
	void testSum() {
		//fail("Not yet implemented");
		assertEquals(125.0, g1.sum(), .0001);
	}

	@Test
	void testMinimum() {
		//fail("Not yet implemented");
		 assertEquals(50.0, g1.minimum(), .0001);
	}

	@Test
	void testFinalScore() {
		//fail("Not yet implemented");
		 assertEquals(75.0, g1.finalScore(), .0001);
	}

}
