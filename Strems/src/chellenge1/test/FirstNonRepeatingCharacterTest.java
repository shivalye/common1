package chellenge1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import chellenge1.FirstNonRepeatingCharacter;

class FirstNonRepeatingCharacterTest {

	@Test
	void test() {
		assertEquals(10, FirstNonRepeatingCharacter.findFirstSingleCharacter("zxcvbzxcvbazxcv"));
		assertEquals(0, FirstNonRepeatingCharacter.findFirstSingleCharacter("z"));
		assertEquals(-1, FirstNonRepeatingCharacter.findFirstSingleCharacter("zzzzzzzzzzzzzzz"));
		assertEquals(6, FirstNonRepeatingCharacter.findFirstSingleCharacter("zzzzzz1zzzzzzzz"));
		
		assertNotEquals(1, FirstNonRepeatingCharacter.findFirstSingleCharacter("zzzzzzzzzzzzzzz"));
		assertNotEquals(1, FirstNonRepeatingCharacter.findFirstSingleCharacter("1zzzzzzzzzzzzzz"));
		assertNotEquals(1, FirstNonRepeatingCharacter.findFirstSingleCharacter("zzzzzzzzzzzzzz1"));
	}

}
