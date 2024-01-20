package Assignment1;

import java.util.Scanner;

class SkyAirlinesDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter source");
        String source = scanner.nextLine();

        System.out.println("Enter destination");
        String destination = scanner.nextLine();

        SkyAirlines customer = new SkyAirlines(name, source, destination);

        printMessage(customer);
    }

    public static void printMessage(SkyAirlines customer) {
        System.out.print("Dear " + customer.getName() + ",");
        System.out.print("welcome onboard with service from"+" "+ customer.getSource()+" "+"to"+" " +customer.getDestination()+".");
        System.out.println("Thank you for choosing Sky Airlines.Enjoy you flight.");
    }
}