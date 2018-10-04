/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphismabstractinterface;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PraktikBeratBadanIdeal {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Manusia[] m = new Manusia[2];
        int x = 0;
        do{
            System.out.println("User " + (x + 1));
            System.out.println("Masukkan tinggi badan anda(cm) : ");
            double t = input.nextDouble();
            System.out.println("Masukkan jenis kelamin anda(L/P) : ");
            String jk = input.next();
            
            if(jk.toUpperCase().equals("L")){
                m[x] = new Laki_Laki(t);
                System.out.println("Berat badan ideal laki laki adalah " + m[x].HtgBBI());
                System.out.println("");
            } else { 
                m[x] = new Perempuan(t);
                System.out.println("Berat badan ideal perempuan adalah " + m[x].HtgBBI());
                System.out.println("");
            }
            x++;       
        }while (x<2);
    }
    
}
