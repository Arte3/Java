
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

// Llegir per teclat dos vectors de 10 números i 
// barrejar-los en un tercer vector de manera que: 
// el 1r de A, el 1r de B, el 2n de A, el 2n de B, etc.

public class A4Unidimensionals_09 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        
        int cont = 0;
        
        int[] vector1 = new int[10];
        int[] vector2 = new int[10];
        int[] vector3 = new int[20];
        
        for (int i = 0; i < vector1.length; i++)
            vector1[i] = in.nextInt();
        for (int i = 0; i < vector2.length; i++)
            vector2[i] = in.nextInt();
        
        for (int i = 0; i < vector3.length; i++){
            vector3[i] = vector1[cont];
            i++;
            vector3[i] = vector2[cont];
            cont++;
        }
        
        for (int element : vector3)
            System.out.print(element + " ");
        System.out.println();
    }
}