/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abde
 */
public class A4Unidimensionals_01 {
    public static void main (String[] args){        
        int[] unArray = new int[10];
        for (int i = 0; i < unArray.length; i++)
            unArray[i] = 2 * i;
        for (int element : unArray)
            System.out.print(element + " ");
        System.out.println();
    }
}
