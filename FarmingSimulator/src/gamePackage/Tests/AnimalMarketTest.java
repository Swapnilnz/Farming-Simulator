package gamePackage.Tests;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JFrame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gamePackage.AnimalMarket;
import gamePackage.Farm;
import gamePackage.GameEnvironment;
import gamePackage.PlainsFarm;

/**
 * Tests Animal Market Class
 * @author Swapnil Bhagat, Reed Earl
 *
 */
class AnimalMarketTest {
	
	GameEnvironment game;
	Farm farm;
	AnimalMarket market;
	JFrame window;
	
	@BeforeEach
	public void init() {
		game = new GameEnvironment();
		farm = new PlainsFarm();
		game.farm = farm;
		market = new AnimalMarket();
		window = new JFrame();
	}
	
	@Test
	public void buyCowTest() {
		market.buyCow(game, 1, window);
		assertEquals(90, game.farm.getFarmMoney());
		market.buyCow(game, 50000, window);
		assertTrue(market.test);
	}

	@Test
	void buyPigTest() {
		market.buyPig(game, 1, window);
		assertEquals(92, game.farm.getFarmMoney());
		market.buyPig(game, 50000, window);
		assertTrue(market.test);
	}
	
	@Test
	void buyChickenTest() {
		market.buyChicken(game, 1, window);
		assertEquals(95, game.farm.getFarmMoney());
		market.buyChicken(game, 50000, window);
		assertTrue(market.test);
	}
	
	@Test
	void buySheepTest() {
		market.buySheep(game, 1, window);
		assertEquals(91, game.farm.getFarmMoney());
		market.buySheep(game, 50000, window);
		assertTrue(market.test);
	}

}
