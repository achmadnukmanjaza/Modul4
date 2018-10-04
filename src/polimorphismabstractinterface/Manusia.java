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
public abstract class Manusia {
    private double TinggiBadan;
    public Manusia (double TB){
        TinggiBadan=TB;
    }
    public double getTB(){
        return TinggiBadan;
    }
    public abstract double HtgBBI();{
    
}
    
}
