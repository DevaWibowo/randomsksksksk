/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character0;

import java.util.ArrayList;

/**
 *
 * @author kuma
 */
public class Inventory {
    public static void main(String[] args){
        new Inventory();
    }
    
    Inventory(){
        Potion p = new Potion();
        Item it = new Item();
        ArrayList<Item> in = new ArrayList<Item>();
        in.add(p);
        System.out.println(in);
    }
    
    
    
}
