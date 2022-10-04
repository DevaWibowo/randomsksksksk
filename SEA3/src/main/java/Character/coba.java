package Character;

import java.awt.DisplayMode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kuma
 */
public class coba {
    Karakter k1 = new Karakter();
    Karakter k2 = new Karakter();
    
    private void SettingK1(){
        k1.setMaxHealth(1000);
        k1.setDefense(10);
        k1.setAttack(10);
    }
    
    private void SettingK2(){
        k2.setMaxHealth(2000);
        k2.setDefense(20);
        k2.setAttack(20);
    }
    
    public coba(){
        SettingK1();
        SettingK2();
        Display();
        System.out.println();
        Display2();
        
        k1.Attack(k2);
//        k2.Heal();
//        k1.Defend(k2);
        
        System.out.println("========================");
        
//        Display();
//        System.out.println();
//        Display2();
    }
    
    private void Display(){
        String mh, a, d;
        mh = (int) k1.getMaxHealth() + "";
        a = (int) k1.getAttack() + "";
        d = (int) k1.getDefense() + "";
        System.out.println("Max Health: " + mh);
        System.out.println("Attack    : " + a);
        System.out.println("Defense   : " + d);
    }
    private void Display2(){
        String mh, a, d;
        mh = (int) k2.getMaxHealth() + "";
        a = (int) k2.getAttack() + "";
        d = (int) k2.getDefense() + "";
        System.out.println("Max Health: " + mh);
        System.out.println("Attack    : " + a);
        System.out.println("Defense   : " + d);
    }
    
    public static void main(String[] args){
        new coba();
    }
}
