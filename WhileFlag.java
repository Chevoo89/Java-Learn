/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whileflag;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class WhileFlag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        int value = 0,sum = 0;
        boolean nonnegative = true;
        while(nonnegative){
            value = in.nextInt();
            if (value <0)
                nonnegative = false;
            else
                sum += value;
        }
        System.out.println("the sum of numbers is: " + sum);
        in.close();
    }
    
}
