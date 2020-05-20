package gamePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FarmerTest {

	@Test
	void farmNameTest() {
		Farmer farmer = new Farmer("George", 5);
		assertEquals("George", farmer.getName());
		assertEquals(5, farmer.getAge());
		farmer.setAge(100);
		assertEquals(100, farmer.getAge());
		farmer.setName("Daisy");
		assertEquals("Daisy", farmer.getName());
		
	}

}
