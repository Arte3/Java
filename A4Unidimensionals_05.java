/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abde
 */
public class A4Unidimensionals_05 {
    public static void main (String[] args){        
        int[] b = new int[10];
        for (int i = 1; i < b.length; i++)
            b[i] = 5 * i;
        for (int element : b)
            System.out.print(element + " ");
        System.out.println();
} 
}