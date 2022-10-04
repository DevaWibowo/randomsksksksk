/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character0;

/**
 *
 * @author kuma
 */
public class Karakter implements Skill{
    private double Health, Attack;
    Item Potion = new Item();
    
    public double getHealth(){
        return this.Health;
    }
    
    public void TambahHealth(double health){
        this.Health += health;
    }
    
    public void setHealth(double health){
        this.Health = health;
    }
    
    public void UseItem_PotionKecil(){
        this.Health += Potion.IsiPotionKecil();
    }
    
    public void UseItem_PotionSedang(){
        this.Health += Potion.IsiPotionSedang();
    }
    
    public void UseItem_PotionBesar(){
        this.Health += Potion.IsiPotionBesar();
    }
    
    @Override
    public void Defend(Karakter karakter){
        karakter.Health -= this.Attack * 0.5;
    }
    
    @Override
    public void Serang(Karakter karakter){
        karakter.Health -= this.Attack;
    }
    
    @Override
    public void Heal(){
        this.Health += this.Attack * 0.5;
    }
    
    public void setAttack(double attack){
        this.Attack = attack;
    }
}
