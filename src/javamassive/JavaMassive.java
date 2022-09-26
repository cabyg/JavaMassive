/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamassive;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JavaMassive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Random random = new Random();
        int n = 101;
        int sum = 0;
        int[] msv = new int[n];
        for (int i = 0; i < msv.length; i++) {
            while(true){
                int rundNum = random.nextInt(100);
                if (rundNum % 2 != 0){
                    msv[i] = rundNum;
                    break;
                }
            }
        }
        Arrays.sort(msv);    
        for (int i = 1; i < msv.length; i++) {
            System.out.printf("%-4d", msv[i]);
            sum += msv[i];  
            if (i%10==0){
                System.out.println("");
            }
               
        }
        System.out.println();
        System.out.println("Average: " + sum/n);
    }
}