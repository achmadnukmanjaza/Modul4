package polimorphismabstractinterface;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class PraktikKalkulator {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Bilangan pertama : ");
        double x = scan.nextDouble();
        System.out.println("masukkan billangan kedua : ");
        double y = scan.nextDouble();
        
        Kalkulator k1 = new Kalkulator(x,y)();
        
        System.out.println("Hasil penjumblahan : " + k1.penjumblahan());
        System.out.println("Hasil Pengurangan : " + k1.pengurangan());
        System.out.println("Hasil Perkalian : " + k1.perkalian());
        System.out.println("hasil pembagian : " + k1.pembagian());
        
    }
    
}

