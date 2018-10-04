/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphismabstractinterface;

/**
 *
 * @author HP
 */
public class Singa extends Hewan{
    
        @Override
    void setBerat() {
        double berat = 10.0; //To change body of generated methods, choose Tools | Templates.
        System.out.println("Berat Singa : " + berat + "Kg");
    }

    @Override
    void setSuara() {
        String suara = "Roaaarrrr"; //To change body of generated methods, choose Tools | Templates.
        System.out.println("Suara Singa : " + suara);
    }

    @Override
    void setNama() {
        String singa = "Diablo"; //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nama Singa : " + singa);
    }

}
