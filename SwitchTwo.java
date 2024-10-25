/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchtwo;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class SwitchTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner (System.in);
        int choice;
        int num1,num2,result;   
        System.out.println("Enter your choice");
            System.out.println("1.Add two numbers");
            System.out.println("2.subtraction two numbers");
            System.out.println("3.Get the square of a number");
        choice = read.nextInt();
        
        switch(choice){
            case 1 :
                System.out.println("1.Enter two numbers");
                num1=read.nextInt();
                num2 = read.nextInt();
                result = num1 + num2;
                System.out.println(result);
                break;
            case 2:
                System.out.println("1.Enter two numbers");
                num1=read.nextInt();
                num2 = read.nextInt();
                result = num1 - num2;
                System.out.println(result);
                break;
            case 3:
                System.out.println("Enter positive number");
                num1=read.nextInt();
                if (num1>0)
                    System.out.println(num1 * num1);
                else
                    System.out.println("negative number");
                break;
            default :
                    System.out.println("Invaild Input choice");
        }
    }   
}
