/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dowhile;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class DoWhile {
    public static void main (String[] args){
        Scanner reader = new Scanner (System.in);
        int counter = 1;
        int grade , sum = 0;
        do{
            System.out.printf("Enter the Grade of Student no: %d \n", counter);
            grade = reader.nextInt();
            sum += grade;
            counter++;
        }while(counter <=6);
        System.out.printf("The Gradeavarage of 6 Students is: %f \n", (float)sum/6);
        reader.close();
    }
  }

