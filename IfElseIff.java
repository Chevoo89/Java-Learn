/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelseiff;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class IfElseIff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner mark = new Scanner (System.in);
		int marks;
		System.out.println("Enter your Mark");
		marks = mark.nextInt();
		if(marks>=90 && marks<=100)
            System.out.println("You got A");
       else if (marks>=80 && marks<90)
            System.out.println("You got B");
       else if (marks>=70 && marks<80)
            System.out.println("You got C");
       else if (marks>=60 && marks<70)
            System.out.println("You got D");
       else if (marks<60)
            System.out.println("F\n");
	   else if(marks>=0 && marks<=100)
			System.out.println("The Number is betweem 0 and 100");
		else
			System.out.println("The Number is out of range");
		mark.close();
    }            
}
