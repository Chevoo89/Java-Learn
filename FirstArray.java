/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstarray;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class FirstArray {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = in.nextInt();
        int [] numbers = new int [size];
        
        for(int i=0;i<numbers.length;i++)
        {
            System.out.println("Enter Number. " +(i+1));
            numbers[i]=in.nextInt();
        }
            int sum = 0,count=0;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]>0){
            sum += numbers[i];
            count++;
            }
        }
        System.out.println("The avarage of Positive numbers is " + sum/count);
    }
}
