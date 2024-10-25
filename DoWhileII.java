/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dowhileii;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class DoWhileII {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int option;
        int num1,num2;
        do{
            System.out.println("choose on of the option please!");
            System.out.println("1. Add two Numbers");
            System.out.println("2. Subtraction two Numbers");
            System.out.println("3. Divide two positive Numbers");
            System.out.println("0. Exit");
            option = input.nextInt();
            switch(option){
                case 1:
                    System.out.println("please enter two Numbers");
                    num1 = input.nextInt();
                    num2 = input.nextInt();
                    System.out.println("sum of the two Numbers is: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("please enter two Numbers");
                    num1 = input.nextInt();
                    num2 = input.nextInt();
                    System.out.println("sub of the two Numbers is: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("please enter two Numbers");
                    num1 = input.nextInt();
                    num2 = input.nextInt();
                    System.out.println("divide of the two Numbers is: " + (num1/num2));
                    break;
                case 0:
                    System.out.println("good bye!");
                    break;
                default:
                     System.out.println("invaild Option");
            }
        }while(option !=0);
    }
}
