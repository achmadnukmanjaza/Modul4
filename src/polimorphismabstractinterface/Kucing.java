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
class Kucing extends Hewan{

    @Override
    void setBerat() {
        double berat = 2.0; //To change body of generated methods, choose Tools | Templates.
        System.out.println("Berat Kucing : " + berat + "Kg");
    }

    @Override
    void setSuara() {
        String suara = "Miaw Meow Meong"; //To change body of generated methods, choose Tools | Templates.
        System.out.println("Suara Kucing : " + suara);
    }

    @Override
    void setNama() {
        String kucing = "Carberus"; //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nama Kucing : " + kucing);
    }
    

 
}
