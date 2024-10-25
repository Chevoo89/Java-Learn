/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nestedif;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;

public class NestedIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int number;
        System.out.println("Enter number to test");
        number = input.nextInt();
        if (number>=0)
        {
                if(number%2==0){
                    System.out.println("Positive Number");
                    System.out.println("Even Number");                
                }
            else
                    System.out.println("Odd Number");
        } 
        else
            System.out.println("Negative Number");
    }
}