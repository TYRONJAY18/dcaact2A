/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.tyron;
import java.util.Scanner;
/**
 *
 * @author CL2~PC38
 */
public class midterm_activity {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("CAFETERIA");
        System.out.println("[1] - Snacks");
        System.out.println("[1] = hotdog [25.00]");
        System.out.println("[2] = Soimai [15.00]");
        System.out.println("[2] - Drinks");
        System.out.println("[1] = Coke [35.00]");
        System.out.println("[2] = Royal [25.00]");
        //input for choice s/d
        System.out.println("Enter your Choice: ");
        int choose = input.nextInt();
        
        //1st if condition for choid
        if (choose == 1)
        {
        System.out.println("[1] - Hotdot - P25");
        System.out.println("[2] - siomai - P15");
        int hotdog = 25;
         int siomai = 15;
        System.out.println("Enter your Choice of Snacks:");
        int snacks = input.nextInt();
        
        if (snacks == 1)
        {
        System.out.println("You Choose Hot Dog");
        System.out.println("enter quantity: ");
        int quan = input.nextInt();
        int quan1 = quan * hotdog;
        System.out.println("sub total:"+ quan1);
        double tax = 0.12;
        double vat = quan1 * tax;
        double total = vat + quan1;
        System.out.println("Total: " + total);
        System.out.println("Enter your Cash: ");
        int cash = input.nextInt();
        double change = cash - total;
        while(cash < total)
        {
        System.out.println("Insufficient payment received, please try again!");
        System.out.println("Enter payment:");
        cash = input.nextInt();
        }
         change = cash - total;
         System.out.println("Snacks");
         System.out.println("\nYou Choose Hot Dog");
         System.out.print("\nAmount: " + hotdog);
         System.out.print("\nQuantity: " + quan);
         System.out.print("\nQuantity: " + quan1);
         System.out.print("\nYour Tax (12): " + vat);
         System.out.print("\nYour Total is: " + total);
         System.out.print("\nYour change is: " + change);
        }
        else if(snacks == 2)
        {
        System.out.println("You Choose Siomai");
        System.out.println("enter quantity: ");
        int quan = input.nextInt();
        int quan1 = quan * siomai;
        System.out.println("sub total:"+ quan1);
        double tax = 0.12;
        double vat = quan1 * tax;
        double total = vat + quan1;
        System.out.println("Total: " + total);
        System.out.println("Enter your Cash: ");
        int cash = input.nextInt();
        double change = cash - total;
        while(cash < total)
        {
        System.out.println("Total: " + total);
        System.out.println("Insufficient payment received, please try again!");
        System.out.println("Enter payment:");
        cash = input.nextInt();
        }
         change = cash - total;
         System.out.println("Snacks");
         System.out.println("\nYou Choose Siomai");
         System.out.print("\nAmount: " + siomai);
         System.out.print("\nQuantity: " + quan);
         System.out.print("\nQuantity: " + quan1);
         System.out.print("\nYour Tax (12): " + vat);
         System.out.print("\nYour Total is: " + total);
         System.out.print("\nYour change is: " + change);
        }else {
            System.out.println("Invalid option");
            }
        }else if (choose == 2)
        {
        System.out.println("[1] - Coke - P35");
        System.out.println("[2] - Royal - P25");
        int coke = 25;
         int Royal = 25;
        System.out.println("Enter your Choice:");
        int drinks = input.nextInt();
        
        if (drinks == 1)
        {
        System.out.println("You Choose Coke");
        System.out.println("enter quantity: ");
        int quan = input.nextInt();
        int quan1 = quan * coke;
        System.out.println("sub total:"+ quan1);
        double tax = 0.12;
        double vat = quan1 * tax;
        double total = vat + quan1;
        System.out.println("Total: " + total);
        System.out.println("Enter your Cash: ");
        int cash = input.nextInt();
        double change = cash - total;
        while(cash < total)
        {
        System.out.println("Insufficient payment received, please try again!");
        System.out.println("Enter payment:");
        cash = input.nextInt();
        }
         change = cash - total;
         System.out.println("Drinks");
         System.out.println("\nYou Choose Coke");
         System.out.print("\nAmount: " + coke);
         System.out.print("\nQuantity: " + quan);
         System.out.print("\nQuantity: " + quan1);
         System.out.print("\nYour Tax (12): " + vat);
         System.out.print("\nYour Total is: " + total);
         System.out.print("\nYour change is: " + change);
        }
        else if (drinks == 2)
        {
        System.out.println("You Choose Royal");
        System.out.println("enter quantity: ");
        int quan = input.nextInt();
        int quan1 = quan * Royal;
        System.out.println("sub total:"+ quan1);
        double tax = 0.12;
        double vat = quan1 * tax;
        double total = vat + quan1;
        System.out.println("Total: " + total);
        System.out.println("Enter your Cash: ");
        int cash = input.nextInt();
        double change = cash - total;
        while(cash < total)
        {
        System.out.println("Insufficient payment received, please try again!");
        System.out.println("Enter payment:");
        cash = input.nextInt();
        }
         change = cash - total;
         System.out.println("Drinks");
         System.out.println("\nYou Choose Royal");
         System.out.print("\nAmount: " + Royal);
         System.out.print("\nQuantity: " + quan);
         System.out.print("\nQuantity: " + quan1);
         System.out.print("\nYour Tax (12): " + vat);
         System.out.print("\nYour Total is: " + total);
         System.out.print("\nYour change is: " + change); 
        } else {
            System.out.println("Invalid option");
            }
    } else {
            System.out.println("Invalid category");
        }
}
}