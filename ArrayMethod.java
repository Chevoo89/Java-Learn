/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraymethod;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class ArrayMethod {
 static Scanner in = new Scanner (System.in);
    public static void main (String[] args){
       int size;
        System.out.println("Enter size of Array");
        size = in.nextInt();
        int [] ids = new int [size];
        fillArray(ids);
        System.out.println("**************");
        System.out.println("You have following Ids: ");
        printArray(ids);
        
        System.out.println("Enter the id to search for");
        int searchid = in.nextInt();
        int returnedindex = searchArray(ids,searchid);
        
        if (returnedindex>=0)
            System.out.println("The Items is Found");
        else
            System.out.println("The Items is not Found");
        
    }
    public static void fillArray (int [] ids){
        for(int i=0;i<ids.length;i++){
            System.out.println("Enter No. " + (i+1));
            ids[i]= in.nextInt();
        }
    }
    public static void printArray(int[] list){
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]);
        }
    }
    public static int searchArray(int[] list, int target){
        for(int i=0;i<list.length;i++)
            if(list[i]==target)
                return i;
           return -1;     
        }
    }