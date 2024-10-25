/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package averagegrade;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class AverageGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int counter = 1;
        int grade =0,sum =0;
        while(counter<=6){
            System.out.printf("Enter Grade of Student no %d \n", counter);
            grade = input.nextInt();
            sum += grade;
            counter++;
        }
            System.out.printf("The Average of all sechs Students Grades is: %f",(float)sum/6);
            input.close();
    }
}
