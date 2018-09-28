package com.company;

import com.sun.istack.internal.NotNull;

import javax.xml.bind.PrintConversionEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Grocery groceryList = new Grocery(getGroceryList());
        printGrocery(groceryList, "Grocery Invoice");
    }

    private static ArrayList<Person> getGroceryList() {
        ArrayList<Person> grocery = new ArrayList<>();


        Scanner input = new Scanner(System.in);
        String ItemName, quit = " ";
        int Price=0, Quantity=0, Cost=0;


        do {
            Person person= new Person(Price, Quantity, Cost);


            System.out.println("Enter grocery items");
            ItemName = input.nextLine();

            System.out.println("Enter item price : " + "");
            Price = input.nextInt();

            System.out.println("Enter quantity");
            Quantity = input.nextInt();
            System.out.println();

            System.out.println("Cost: $" + (Quantity * Price));
            input.nextLine();

            person = new Person(Price, Quantity);
            grocery.add(person);

            System.out.println("Add new item Y(yes) or Q(quit)");
            quit = input.nextLine();

        } while (!quit.equalsIgnoreCase("Q")) ;

        return grocery;
    }

    private static void printGrocery(Grocery grocery, String header) {

        System.out.println("\n =========================================" + header + "========================================");
        System.out.println("ItemName\t\t\t\tPrice\t\t\t\tQuantity\t\t\t\tCost");

        for (Person person : grocery.getGrocery()) {
            System.out.println(person.getItemName() + "\t\t\t\t" + "$" + person.getPrice()+ "\t\t\t\t" + "$" + person.getQuantity()+ "\t\t\t\t" + "$"+ person.getCost());
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Total Purchase Amount = $ ");
        int columnTotal = 0;
        while (true) {
            int Cost = input.nextInt();
            if (Cost == 0) break;
            columnTotal += Cost;
        }
        System.out.println("The Total Purchase Amount is $ " + columnTotal);

        System.out.println("Total Items Purchased: " );
        int Price = 0;
        for (int i = 0; i <= Price; i++) ;
        {
            int i = 0;
            if (i == 0) {
                ++Price;
            }

            System.out.println(Price);

        }
    }
}
