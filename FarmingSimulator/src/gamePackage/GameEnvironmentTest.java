package gamePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameEnvironmentTest {
	
	private GameEnvironment gameTest;

	@BeforeEach
	public void init() {
		gameTest = new GameEnvironment();
	}
	
	@Test
	public void farmerNameTest() {
		assertTrue(gameTest.farmerNameChecker("Dave"));
		assertTrue(gameTest.farmerNameChecker("God"));
		assertTrue(gameTest.farmerNameChecker("abcdefghijklmno"));
		assertFalse(gameTest.farmerNameChecker("Dave1"));
		assertFalse(gameTest.farmerNameChecker("abcdefghijklmnop"));
		assertFalse(gameTest.farmerNameChecker("ab"));
		assertFalse(gameTest.farmerNameChecker("12345"));
	}

	
}
