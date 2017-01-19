
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abderrahim
 */

//Llegir 5 números per teclat i a continuació realitzar la mitja 
//dels números positius, la mitja dels números negatius i 
//comptar el número de ceros.

public class A4Unidimensionals_08 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int[] num = new int[5];
        int pos = 0, neg = 0, zero =0;
        int i;
        double sumPos = 0, sumNeg = 0;
        
        for (i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        
        for (i = 0; i < num.length; i++) {
            if (num[i] > 0){
                sumPos += num[i];
                pos++;
            } else if (num[i] < 0){
                sumNeg += num[i];
                neg++;
            } else {
                zero++;
            }
        }
        
        if (pos != 0) {
            System.out.println("Mitjana dels valors positius: " + sumPos / pos);
        } else {
            System.out.println("No s'han introduit valors positius");
        }
        
        if (neg != 0) {
            System.out.println("Mitjana dels valors negatius: " + sumNeg / neg);
        } else {
            System.out.println("No s'han introduit valors negatius");
        }
        
        if (zero != 0) {
            System.out.println("Zeros: " + zero);
        } else {
            System.out.println("No s'han introduit zeros");
        }
    }
}
