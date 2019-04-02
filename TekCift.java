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
        
        for(int j=0; j<=i ;j++ ){
            if((j%2)==0){
                System.out.println(""+j+" - Çift sayıdır");
            }
            else if((j%2)==1){
                System.out.println(""+j+" - Tek sayıdır");
            }
        }
             
        
   
    }
    
}
