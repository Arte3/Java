/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Abde
 */

// Llegir 5 números per teclat i 
//mostrar-los en el mateix ordre introduït.

public class A4Unidimensionals_06 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++)
                num[i] = in.nextInt();
        for (int element : num)
            System.out.print(element + " ");
        System.out.println();
    }
}
