/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan;

import com.seania.sea2.Karakter;

/**
 *
 * @author kuma
 */
public class A {
    Karakter aku = new Karakter("Aku", 120, 11, 500, true);
    
    
    A(){
        aku.setTurn(false);
        boolean a = aku.getTurn();
        
        if(a == true){
            System.out.println("Adalah benar");
        }else{
            System.out.println("Adalah tidak benar");
        }
    }
    
    public static void main(String[] args){
        new A();
    }    
}
