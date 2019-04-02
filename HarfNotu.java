/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/*kullanıcıdan sayı alıp alınan sayı karşısında harf notu getiren program

90+ AA
80 - 90 BB
70 - 80 CC
70- F
*/

/**
 *
 * @author Asli
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Lütfen notunuzu giriniz:");
        Scanner s = new Scanner (System.in);
        
        int i = s.nextInt();
        
        if(i>=90){
            System.out.println("Notunuz : AA");
        }
        else if(i>=80){
            System.out.println("Notunuz : BB");
        }
        else if(i>=70){
            System.out.println("Notunuz : CC");
        }
        else {
            System.out.println("Notunuz : F");
        }
        
        
        
   
    }
    
}
