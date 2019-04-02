/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Asli
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a=10, b=20, c=30;
        System.out.println("sonuc 1:"+ (a+b));
        System.out.println("sonuc 2:"+a+b);
        System.out.println("sonuc 3:"+(float)((float)a/(float)b)); // type casting ile çıkacak sonucu integerdan float a çevirdik.
        System.out.println("sonuc 4:"+(10>>2)); //1010 0101 0010 bitwise operators sonuç=2
        System.out.println("sonuc 5:"+ (a<b)); //Sonuca göre true veya false çevirir.
    }
    
}
