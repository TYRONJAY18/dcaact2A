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
        System.out.println("[2] - Soimai [14.00]");
        System.out.println("[2] - Drinks");
        System.out.println("[1] - Snacks");
        System.out.println("[1] - Snacks");
        //input for choice s/d
        System.out.println("Enter your Choice: ");
        int choi = input.nextInt();
        
        //1st if condition for choid
        if (choi == 1)
        {
        System.out.println("Snacks");
        int hot = 25;
        System.out.println("Enter your Choice of Snacks:");
        int snacks = input.nextInt();
        
        if (snacks == 1)
        {
        System.out.println("You Choose Hot Dog");
        System.out.println("enter quantity: ");
        int quan = input.nextInt();
        int quan1 = quan * hot;
        System.out.println("sub total:"+ quan1);
        double tax = 0.12;
        double vat = quan1 * tax;
        double total = vat + quan1;
        System.out.println("Total: " + total);
        System.out.println("Enter your Cash: ");
        int csh = input.nextInt();
        double change = csh - total;
        while(csh < total)
        {
        System.out.println("Enter your Cash: ");
        csh = input.nextInt();
        }
        System.out.println("change is: " +change);
        }
        }
        
        else if (choi == 1)
        {
        System.out.println("Snacks");
        int sio = 15;
        System.out.println("Enter your Choice of Snacks:");
        int snacks = input.nextInt();
        
        if (snacks == 2)
        {
        System.out.println("You Choose Siomai");
        System.out.println("enter quantity: ");
        int quan = input.nextInt();
        int quan1 = quan * sio;
        System.out.println("sub total:"+ quan1);
        double tax = 0.12;
        double vat = quan1 * tax;
        double total = vat + quan1;
        System.out.println("Total: " + total);
        System.out.println("Enter your Cash: ");
        int csh = input.nextInt();
        double change = csh - total;
        System.out.println("Change is: "+ change);
        while(csh < total)
        {
        System.out.println("Enter your Cash: ");
        csh = input.nextInt();
        }
        System.out.println("change is: " +change);
        }    
    }
}
}