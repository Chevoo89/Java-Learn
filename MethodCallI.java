/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodcall.i;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class MethodCallI {
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n1,n2,n3,s;
        double a;
        System.out.println("Enter three Numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
       s= sum(n1,n2,n3);
       a= avarege(n1,n2,n3);
       desplay(s,a);
    } 
    public static int sum (int i, int j, int k){
        return i+j+k;
    }
    public static double avarege (int i, int j, int k){
        return sum(i,j,k)/3;
    }
    public static void desplay(int s, double a){
        System.out.println("The sum of your input Numbers: " + s);
        System.out.println("The avarege of your input Numbers: " + a);
    }
}
