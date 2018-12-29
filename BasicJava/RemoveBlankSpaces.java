
public class RemoveBlankSpaces {
	public String identifyAndRemoveSpacesInString(String input, String wordToBeDeleted, int wordPositionInSentence) {

		StringBuffer s=new StringBuffer();
		String[] splittedString=input.split("\\s+");
		
		for(int i=0;i<splittedString.length;i++){
			if(!((i+1)==wordPositionInSentence && wordToBeDeleted.equals(splittedString[i]))){
				s.append(splittedString[i]+" ");
			}
		}
		return s.toString();
	}
}
