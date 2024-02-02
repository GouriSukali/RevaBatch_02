package Assignment2;
import java.util.Scanner;

public class Sentence {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence =sc.nextLine();
		System.out.println("Enter the word");
		String word =sc.nextLine();
		Sentencemethod c=new Sentencemethod();
		c.Check(sentence,word);
		
	}
}


