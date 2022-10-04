/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character0;

/**
 *
 * @author kuma
 */
public class Karakter extends Talent implements Skill{
    private double Health, Attack;
    
    public double getHealth(){
        return this.Health;
    }
    
    public void Sekil1(Karakter karakter){
        karakter.Skill1(this);
    }
    
    public void TambahHealth(double health){
        this.Health += health;
    }
    
    public void setHealth(double health){
        this.Health = health;
    }
    
    public void UseItem_PotionKecil(Potion potion){
        this.Health += potion.IsiPotionKecil();
        potion.kurangStock(1);
    }
    
    public void UseItem_PotionSedang(Potion potion){
        this.Health += potion.IsiPotionSedang();
        potion.kurangStock(1);
    }
    
    public void UseItem_PotionBesar(Potion potion){
        this.Health += potion.IsiPotionBesar();
        potion.kurangStock(1);
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
