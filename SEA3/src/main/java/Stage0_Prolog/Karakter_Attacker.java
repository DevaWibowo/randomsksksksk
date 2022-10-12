package Stage0_Prolog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kuma
 */
public class Karakter_Attacker extends Karakter{
    Senjata s = new Senjata();
    
    Karakter_Attacker ka = new Karakter_Attacker(s);
    
    public Karakter_Attacker(Senjata senjata) {
        s.setDamage(10);
        ka.setDamage(20);
        
    }
    
    public static void main(String[] args){
        
    }
    
}
