/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2d;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class Array2D {

    /**
     * @param args the command line arguments
     */
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] marks = new int [4][2];
        fillArray(marks);
        System.out.println("The marks are filled" );
        System.out.println("*********************");
        System.out.println("marks will be printed");
        printArray(marks);
        System.out.println("*********************");
        int markstot = sumArray(marks,0);
        System.out.println("the sum of all enterd marks is: " + markstot);
        System.out.println("*********************");
        System.out.println("Enter the Mark, which you search ");
        int markf = reader.nextInt();
        int suchm = searchArray(marks[0],markf);
            if(suchm!= -1)     
            System.out.println("we found the mark in our Register");
            else
             System.out.println("sorry! we did not found the mark in our Register");   
    }
    public static void fillArray(int[][] list){
        for(int row=0; row<list.length; row++)
            for(int col=0; col<list[0].length;col++){
                System.out.println("Enter the Elements of marks array of Row No." + (row+1) + " and column No." + (col+1));
                list[row][col] = reader.nextInt();
            }
    }
    public static void printArray(int[][] list){
         for(int row=0; row<list.length; row++){
            for(int col=0; col<list[0].length;col++)
                System.out.println(list[row][col]);
        }
    }
    public static int sumArray (int[][] list, int sum){
        for(int row=0; row<list.length; row++){
            for(int col=0; col<list[0].length;col++)
                sum += list[row][col];
    }
        return sum;
  }
    public static int searchArray(int[]list,int target){
        for(int row=0; row<list.length; row++)
            if(list[row]== target){
                return row;
                }
                return -1;
            }
        }