/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character0;

/**
 *
 * @author kuma
 */
public class Potion extends Item implements PotionIm{
    @Override
    public double IsiPotionKecil(){
        return 20;
    }
    
    @Override
    public double IsiPotionSedang(){
        return 50;
    }
    
    @Override
    public double IsiPotionBesar(){
        return 100;
    }
}
