package Assignment2;

import java.util.Scanner;

class JackAndJoy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = scanner.nextLine();

        JackAndJoyDemo wordProcessor = new JackAndJoyDemo();
        wordProcessor.processSentence(sentence);
    }
}


