/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumofgrades;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class SumOfGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        int counter = 1;
        int grade = 0, sum = 0;
        while (counter <=5 && grade != -1){
            System.out.printf("Enter the Grade of Student no %d\n", counter);
            grade = in.nextInt();
            sum += grade;
            counter++;
        }
        System.out.printf("The sum of grades is %d \n", sum);
        System.out.printf("the Average of all five Grades is: %f",(float)sum/5);
        in.close();
    }
    
}
