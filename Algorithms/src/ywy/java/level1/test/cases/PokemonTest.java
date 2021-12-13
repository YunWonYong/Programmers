package ywy.java.level1.test.cases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ywy.java.level1.Pokemon;
import ywy.java.level1.PokemonSet;

public class PokemonTest {
	private int[][] numbers;
	private int[] answers;
	private Pokemon pokemon;
	private PokemonSet pokemonSet;
	@Before
	public void setUp() throws Exception {
		numbers = new int[][] { { 3, 1, 2, 3 }, { 3, 3, 3, 2, 2, 4 }, { 3, 3, 3, 2, 2, 2 } };
		answers = new int[] { 2, 3, 2 };
		pokemon = new Pokemon();
		pokemonSet = new PokemonSet();
	}

	@Test
	public void test() throws Exception {
		int index = 0;
		int range = numbers.length;
		int answer = 0;
		do {
			answer = pokemon.solution(numbers[index]);
			assertEquals(this.answers[index], answer);
		} while (++index < range);
	}
	
	@Test
	public void test2() throws Exception {
		int index = 0;
		int range = numbers.length;
		int answer = 0;
		do {
			answer = pokemonSet.solution(numbers[index]);
			assertEquals(this.answers[index], answer);
		} while (++index < range);
	}

}
