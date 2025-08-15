/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tyron;
import java.util.Scanner;
/**
 *
 * @author CL2~PC37
 */
public class Tyron {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("(1 - ROCK 2 - PAPER 3 - SCISSORS)  Player 1: ");
        int x = Integer.parseInt(input.nextLine());
         System.out.print("(1 - ROCK 2 - PAPER 3 - SCISSORS) Player 2: ");
          int y = Integer.parseInt(input.nextLine());
          
          if (x == 1 && y == 1)
          {
           System.out.print("DRAW");
          }
          else if (x == 1 && y == 2)
          {
          System.out.print("PLAYER 2 WIN");
          }
           else if (x == 2 && y == 2)
          {
          System.out.print("DRAW");
          }
            else if (x == 1 && y == 3)
          {
          System.out.print("PLAYER 1 WIN");
          }
             else if (x == 2 && y == 1)
          {
          System.out.print("PLAYER 1 WIN");
          }
              else if (x == 2 && y == 3)
          {
          System.out.print("PLAYER 2 WIN");
          }
             else if (x == 3 && y == 3)
          {
          System.out.print("DRAW");
          }
              else if (x == 2 && y == 1)
          {
          System.out.print("PLAYER 1 WIN");
          }
               else if (x == 3 && y == 1)
          {
          System.out.print("PLAYER 2 WIN");
          }
                else if (x == 3 && y == 2)
          {
          System.out.print("PLAYER 1 WIN");
          }
           else
           {
            System.out.print("INVALID KEY WORDS");
           }
    }
}