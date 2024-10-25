/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelsif;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class IfElsIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int num1,num2;
        System.out.println("Enter 2 numbers");
        num1= input.nextInt();
        num2= input.nextInt();
        if (num1==num2)
            System.out.println("equals Numbers");
        else if (num1>num2)
            System.out.println("Number1 is greater");
        else
            System.out.println("Number2 is greater");           
        }
    }
