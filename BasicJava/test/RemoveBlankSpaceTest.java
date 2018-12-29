/********************************************************************************************************************************/

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RemoveBlankSpaceTest {

	RemoveBlankSpaces removeBlankSpaces;
	
	@Before
	public void setUp(){
		removeBlankSpaces=new RemoveBlankSpaces();
	}
	
	
	@Test
	public void testToRemoveBlankSpaceBetweenWords() {

		String input="A MORNING      WALK IS A     BLESSING FOR THE WHOLE THE DAY";
		String wordToBeDeleted="THE";
		int wordPositionInSentence=10;
		String actualString=removeBlankSpaces.identifyAndRemoveSpacesInString(input,wordToBeDeleted,wordPositionInSentence);
		System.out.println(actualString);
		String expectedString="A MORNING WALK IS A BLESSING FOR THE WHOLE DAY ";
		
		
		assertEquals(expectedString,actualString);
	}
	
	@Test
	public void testToRemoveBlankSpaceAndDeleteWord() {

		String input="AS      YOU SOW, SO   SO YOU REAP";
		String wordToBeDeleted="SO";
		int wordPositionInSentence=4;
		String actualString=removeBlankSpaces.identifyAndRemoveSpacesInString(input,wordToBeDeleted,wordPositionInSentence);
		System.out.println(actualString);
		String expectedString="AS YOU SOW, SO YOU REAP ";
		assertEquals(expectedString,  actualString);
				
	}
}
/********************************************************************************************************************************/
