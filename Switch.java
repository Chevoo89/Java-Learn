/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;

/**
 *
 * @author ASPUser
 */
  import java.util.Scanner;

public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char grade;
        Scanner reader = new Scanner(System.in); 
            System.out.println("Enter Your Grade");
        grade = reader.next().charAt(0);
        switch(grade)
        {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Fair");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invaild Grade");
        }
    }    
}
