/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stage0_Prolog;

/**
 *
 * @author kuma
 */
public class Karakter {
    private double Attack;
    
    public Karakter(){
        
    }
    
    public void setDamage(double attack){
        this.Attack = attack;
    }
    
    public double getDamage(){
        return this.Attack;
    }
}
