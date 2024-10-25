/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision;

/**
 *
 * @author ASPUser
 */
import java.util.Scanner;
public class Revision {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char passengerClass;
        double weightBag,excessWeight,charge=0;
        int groupNumber, passengerNumber,counter,gCounter;
        System.out.println("Enter Number of Flightgroups please!: ");
        groupNumber = input.nextInt();
        for(gCounter=1;gCounter<=groupNumber;gCounter++){
            System.out.println("please enter Passenger Numbers in Group no: " + gCounter);
            passengerNumber = input.nextInt();
            for(counter =1;counter<=passengerNumber;counter++){
                System.out.println("Enter passenger's Class please! ");
                passengerClass = input.next().charAt(0);
                System.out.println("Enter the weight of your Bag please");
                weightBag = input.nextDouble();
                switch(passengerClass){
                    case 'F', 'f' -> {
                        if(weightBag>30){
                            excessWeight = weightBag - 30;
                            charge = excessWeight * 10;
                        }
                    }
                    case 'B', 'b' -> {
                        if(weightBag>25){
                            excessWeight = weightBag - 25;
                            charge = excessWeight * 10;
                        }
                    }
                    case 'E', 'e' -> {
                        if(weightBag>20){
                            excessWeight = weightBag - 20;
                            charge = excessWeight * 10;
                        }
                    }
                    default -> System.out.println("Invalid passenger class!");
                }
                System.out.println("Charge for Group " + gCounter + " Passenger " + counter + " is: " + charge);
            }       
         }
    }
}
