package ie.atu;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 1;

        Customer Part1 = new Customer("Niall", "Donegal", "0842371098", "#2437", true);
        System.out.println(Part1.toString());

        Customer Part2= new Customer();
        System.out.println("Please enter your Name");
        Part2.setName(scan.nextLine());

        System.out.println("Please enter your Address");
        Part2.setAddress(scan.nextLine());

        System.out.println("Please enter your Phone Number");
        Part2.setTeleNumber(scan.nextLine());

        System.out.println("Please enter your Customer ID");
        Part2.setCusNumber(scan.nextLine());

        while(x == 1)
        {
            System.out.println("Are you subscribed to the Mailing List");
            if(scan.nextLine() == "True" || scan.nextLine() == "true")
            {
                Part2.setMailingList(true);
                x = 0;
            }
            else if (scan.nextLine() == "False" || scan.nextLine() == "False")
            {
                Part2.setMailingList(false);
                x = 0;
            }
            else
            {
                System.out.println("Please enter a valid option");
            }

            System.out.println(Part1.toString());
        }
    }
}