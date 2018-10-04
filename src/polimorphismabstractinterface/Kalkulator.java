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
public class Kalkulator implements Operasi{
    public double bil1,bil2;
    public Kalkulator(){
        
    }
    public Kalkulator(double bil1, double bil2){
        this.bil1=bil1;
        this.bil2=bil2;
    
    }
    public double penjumblahan(){
        return bil1+bil2;
    }
    public double pengurangan(){
        return bil1-bil2;
    }
    public double perkalian(){
        return bil1*bil2;
    }
    public double pembagian(){
        return bil1/bil2;
    }
}
