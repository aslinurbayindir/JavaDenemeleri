/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Asli
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    static void yaz (){
        System.out.println("yazı amaçlı bir fonksiyon");
    }
    static int f(int x){
        return 5*x+10;
    }
    static int g(int x, int y){
        return f(y+2*x);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(g(5,3));
        yaz();
    }
    
}
