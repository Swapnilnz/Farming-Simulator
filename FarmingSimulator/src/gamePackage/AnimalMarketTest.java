package gamePackage;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JFrame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
		assertEquals(40, game.farm.getFarmMoney());
	}

	@Test
	void buyPigTest() {
		market.buyPig(game, 1, window);
		assertEquals(42, game.farm.getFarmMoney());
	}
	
	@Test
	void buyChickenTest() {
		market.buyChicken(game, 1, window);
		assertEquals(45, game.farm.getFarmMoney());
	}
	
	@Test
	void buySheepTest() {
		market.buySheep(game, 1, window);
		assertEquals(41, game.farm.getFarmMoney());
	}

}
