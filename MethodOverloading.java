/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodoverloading;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class MethodOverloading {
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        int num1,num2;
        char ch1,ch2;
        System.out.println("Enter two Numbers and two letters");
        num1= in.nextInt();
        num2= in.nextInt();
        System.out.println("the larger number is:" + larger(num1,num2));
        ch1= in.next().charAt(0);
        ch2= in.next().charAt(0);
        // the Program would use Ascii Code to compare two chars
        System.out.println("the larger number is:" + larger(ch1,ch2));
    }
    public static int larger(int a, int b){
        if (a>b)
            return a;
        else return b;
    }
    public static char larger (char a, char b){
        if (a>b)
            return a;
        else return b;
    }
}
