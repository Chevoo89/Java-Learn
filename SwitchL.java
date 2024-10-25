/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchl;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class SwitchL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char letter;
        Scanner read = new Scanner (System.in);
        System.out.println("Enter the Letter ");
        letter = read.next().charAt(0);
        switch(letter){
            case 'a','A','e','E','O','o', 'I','i','U','u' -> System.out.println("is a vowel");
            default -> System.out.println("is a consonant");
        }
    }
    
}
