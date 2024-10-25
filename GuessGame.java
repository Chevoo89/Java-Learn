/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessgame;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class GuessGame {
    public static void main (String[] args){
        Scanner reader = new Scanner (System.in);
        int guess,rand;
        rand = (int)(Math.random()*100);
        boolean play = true;
        // just for us to debug System.out.println("the Generated random Number is: " + rand); 
            while (play){
                System.out.println("Guess a number between 0 and 100 ");
                guess = reader.nextInt();
                if (guess > rand){
                    System.out.println("Guess is too large");
                }else if (guess < rand){
                    System.out.println("Guess is too small");
                    }else{
                        System.out.println("You win Huuuuhuuuu!!!!");
                            play = false;
                            }
                }
        }               
}
