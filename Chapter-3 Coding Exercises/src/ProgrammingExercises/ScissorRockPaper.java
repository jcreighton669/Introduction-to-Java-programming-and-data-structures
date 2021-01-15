/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class ScissorRockPaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int computerOption = (int)(Math.random() * 3);
        
        System.out.print("scissor (0), rock (1), paper (2): ");
        int playerChoice = input.nextInt();
        
        switch (computerOption) {
            case 0:
                System.out.print("The computer is scissor. ");
                switch (playerChoice) {
                    case 0:
                        System.out.print("You are scissor. ");
                        System.out.print("It is a draw. ");
                        break;
                    case 1:
                        System.out.print("You are rock. ");
                        System.out.print("You won. ");
                        break;
                    case 2:
                        System.out.print("You are paper too. ");
                        System.out.print("You lose. ");
                        break;
                    default:
                        break;
                }   break;
            case 1:
                System.out.print("The computer is rock. ");
                switch (playerChoice) {
                    case 0:
                        System.out.print("You are scissor. ");
                        System.out.print("You lose. ");
                        break;
                    case 1:
                        System.out.print("You are rock. ");
                        System.out.print("It is a draw. ");
                        break;
                    case 2:
                        System.out.print("You are paper too. ");
                        System.out.print("You won. ");
                        break;
                    default:
                        break;
                }   break;
            case 2:
                System.out.print("The computer is paper");
                switch (playerChoice) {
                    case 0:
                        System.out.print("You are scissor. ");
                        System.out.print("You won. ");
                        break;
                    case 1:
                        System.out.print("You are rock. ");
                        System.out.print("You lose. ");
                        break;
                    case 2:
                        System.out.print("You are paper too. ");
                        System.out.println("It is a draw. ");
                        break;
                    default:
                        break;
                }   break;
            default:
                break;
        }
        
        input.close();
    }
}
