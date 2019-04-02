/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;


/**
 *
 * @author Asli
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Üst limit giriniz:");
        Scanner s = new Scanner (System.in);
        
        int i = s.nextInt();
        
        int sayi = 1;
        
        for(int j=1; j<=i ;j++ ){
            sayi=sayi*2;
            System.out.println("2^"+j+" = "+sayi);      
            
        }
             
        
   
    }
