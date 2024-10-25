/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scope;

/**
 *
 * @author ASPUser
 */
public class Scop {
    static int globalvar;
    public static void main (String[] args){
        globalvar=100;
        int globalvar;
        globalvar=500;
        System.out.println(Scop.globalvar);
        int localx=100;
        {
            localx=700;
            int blockvar=10;
            blockvar=900;
        }
        display();
    } 
    public static void display(){
        System.out.println(globalvar);
    }
}
