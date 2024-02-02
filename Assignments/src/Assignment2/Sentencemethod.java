package Assignment2;

public class Sentencemethod {
	public void Check(String sentence, String word) {
		if (sentence.contains(word))
		{
			System.out.println(word+" is present in the sentence");
			
		}
		else {
			System.out.println(word+" is not present in the sentence");
		}
			
	}

}
