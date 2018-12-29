
public class RemoveDuplicateCharacters {

	public String removeDuplicates(String input){
		String uniqueCharactersString = new String();  //String is initialized
	    for (int index = 0; index< input.length(); index++) {
	        if(!uniqueCharactersString.contains(String.valueOf(input.charAt(index)))) { // checks for character in string
	        	uniqueCharactersString+= String.valueOf(input.charAt(index));  // if character is not present in string then only it appends the string
	        }
	    }
	    return uniqueCharactersString;
	}

}
