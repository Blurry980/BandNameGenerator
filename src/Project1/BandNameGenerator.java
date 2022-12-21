package Project1;

import java.util.Scanner;

public class BandNameGenerator {

    public static void main(String[] args) {
        // write your code here
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the band name generator!");
        System.out.println("What city do you live in?");
        String city = scnr.nextLine();
        System.out.println("What is the name of a pet you own or have owned? ");
        String pet = scnr.nextLine();
        System.out.println("The name of your new band is: The " + city + " " + pet);
    }
}
