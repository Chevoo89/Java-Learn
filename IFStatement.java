/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifstatement;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class IFStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int marks;
        int number;
        System.out.println("Enter your Marks");
        marks = input.nextInt();
        if (marks>100){
            System.out.println("Full mark is 100");
            System.out.println("Enter your Marks one more tieme");
        }
        if (marks>=60)
            System.out.println("Congratulations, you passed");
        else
           System.out.println("Sorry you did not pass");
        
        System.out.println("Enter number to test");
        number = input.nextInt();
        if(number%2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("odd Number");
        if(number>0)
            System.out.println("Positiv Number");
        else             
            System.out.println("Negative Number");     
    }
  }

