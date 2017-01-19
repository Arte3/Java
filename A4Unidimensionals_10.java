
import java.util.Scanner;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abderrahim
 */

// Crear un programa que llegeixi per teclat un vector de 10 números 
// sencers i el desplaci  una posició cap avall: 
// el primer passa a ser el segon, el segon passa a ser el tercer 
// i així successivament. El darrer passa a ser el primer.

public class A4Unidimensionals_10 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        
        int[] num = new int [10];
	int ultim;
	int llocs = 2;
	for(int i = 0; i < 10;i++){
			
	num[i] = in.nextInt();		
		}

        for(int posi = 1; posi < llocs; posi++){
	ultim = num[9];	
		
	for(int i = 8; i >= 0; i--){
		
		num[i + 1] = num[i];
		
	}
		num[0] = ultim;
}
		for(int i = 0; i < 10;i++){
			System.out.println("valor [" + i + "] = " + num[i]);
		}
    }
}
