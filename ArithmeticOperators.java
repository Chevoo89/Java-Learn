/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticoperators;

/**
 *
 * @author ASPUser
 */
public class ArithmeticOperators {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println(2+3*5);
	  System.out.println((2+3)*5);
	  System.out.println(2*5*5+3*5+7);
	  System.out.println(1+(2*(3+4)));
	  System.out.println(5*2+(9%4));
	  System.out.println((5*2)%(7-4));
          float f = 4.45f;
          int i = (int)f;
          System.out.println(i);
          int n = 7 , g = 2;
          System.out.println(7/2f);
          System.out.println(n/g);
          int MyInt = 9;
          double myDouble = MyInt;// Automatic Castint: int to double
          System.out.println(MyInt); // outputs 9
          System.out.println(myDouble); // outputs  9.0
          double myDouble2 = 9.78d;
          int myInt2 = (int)myDouble2;// Manual casting: double to int
          System.out.println(myDouble2);
          System.out.println(myInt2);
          // set the maximum possible score in the game to 500
          int maxScore = 500;
          // the actual score of the user
          int userScore = 423;
          /*
          calculate the percentage of the user's score in realation to the maximum available score.
          Convert userScore to float to make sure that the division is accurate
          */
          float percentage = (float) userScore / maxScore * 100.00f;
          System.out.println("User's percentage is " + percentage);
          int i3 = 13 , j2 = 4;
          i3++;
          j2++;
          System.out.println( i3);
          System.out.println(j2);
          ++i3;
          ++j2;
          System.out.println(i3);
          System.out.println(j2);
          i3--;
          j2--;
          System.out.println(i3);
          System.out.println(j2);
          --i3;
          --j2;
          System.out.println(i3);
          System.out.println(j2);
          
          int c = 9 , j = 2;
          System.out.println(--c);
          System.out.println(j--);
          System.out.println(j);
          System.out.println(c++);
          System.out.println(c);
          System.out.println(++j);
          
          //c +=5;
          //j *=20;
          System.out.println(c);
          System.out.println(j);
          
          System.out.println(++i * --j * 2);
    }
    
}
