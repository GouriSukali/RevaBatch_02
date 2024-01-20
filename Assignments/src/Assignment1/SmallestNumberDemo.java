package Assignment1;

import java.util.Scanner;

class SmallestNumberDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter FirstNumber:");
        int FirstNumber = scanner.nextInt();

        System.out.println("Enter SecondNumber:");
        int SecondNumber = scanner.nextInt();

        System.out.println("Enter ThirdNumber:");
        int ThirdNumber = scanner.nextInt();

        SmallestNumber small = new SmallestNumber(FirstNumber, SecondNumber, ThirdNumber);

        findsmallest(FirstNumber,SecondNumber,ThirdNumber);
    }

    public static void findsmallest(int FirstNumber,int SecondNumber,int ThirdNumber) {
    	int smallest = (FirstNumber<SecondNumber) ? (FirstNumber<ThirdNumber ? FirstNumber:SecondNumber) : (SecondNumber<ThirdNumber ? SecondNumber:ThirdNumber);
    	if (FirstNumber==SecondNumber && SecondNumber==ThirdNumber) {
    		System.out.println("All numbers are equal");	
    	}
    	else {
    		System.out.println("The smallest number is:"+smallest);
    	}
     
    }
}