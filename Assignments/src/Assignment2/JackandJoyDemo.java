package Assignment2;
import java.util.*;
class JackAndJoyDemo {
    void processSentence(String sentence) {
        if (isValidInput(sentence)) {
            String[] words = sentence.split(" ");
            for (String word : words) {
                String arrangedWord = arrangeLetters(word);
                System.out.print(arrangedWord + " ");
            }
        } else {
            System.out.println(sentence + " is an invalid input");
        }
    }

    public boolean isValidInput(String sentence) {
        return sentence.matches("[a-z ]+");
    }

    public String arrangeLetters(String word) {
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }
}

