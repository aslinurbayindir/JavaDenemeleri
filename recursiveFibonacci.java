/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Asli
 */
public class JavaApplication4 {

    public static int fib(int n){
        if(n==1) return 1;
        if(n==0) return 1;
        return fib(n-1)+fib(n-2);
    
    }
    //fib (10): fib(9) + fib(8)
    //fib (9) : fib(8) + fib(7)
    //fib (8) : fib(7) + fib(6)
    //fib (8) : fib(7) + fib(6)
    // hem zaman hem hafıza kaybına neden oluyor
    //az zamanda kısa satır koduyla yazmamıza rağmen
    
    public static void main(String[] args) {
        // 1 1 2 3 5 8
        for (int i=0;i<10;i++){
            System.out.println(fib(i));
        }
    }
    
}
