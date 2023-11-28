/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author 4
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //this will ask the user if how many number and then add it and then divide the total to the ask
        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter how many values:");
        int ask =sc.nextInt();
        
       
        double total = 0.0;
        double values=0;
        
        
        
        for(int i=1; i<=ask; i++){
            System.out.print("Enter the number's value now: ");
             values=sc.nextDouble();
             total +=values;
        }
        double ave= total/ask;
       
        System.out.println(ave);
        
    }
}
