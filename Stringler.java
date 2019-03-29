/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Asli
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int deg;
        System.out.println("Merhaba Dunya");
        System.out.println("ASlınur BAyındır");
        
        deg=10;
        System.out.println("ASlınur BAyındır "+ deg);
        
        String s = "benim adımm Aslınur BAYINDIR";
        System.out.println("dizgi " + s);
        
        
        s=s.toUpperCase();
       
        int ilkBosluk =s.indexOf(" ");
        String ilkKelime = s. substring(0,ilkBosluk);
        
        int sonBosluk = s.lastIndexOf(" ");
        String sonKelime = s.substring(sonBosluk);
        
        
        System.out.println("dizgi " + s + " ilk bosluk : "+ilkBosluk);
        
        System.out.println("ilk kelime degiskeni"+ilkKelime);
        System.out.println("son kelime "+sonKelime);
        
        
        System.out.println("10. karakter: "+s.charAt(10));
    }
    
}
