/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character0;

import dump.Talent;

enum Tipe {         
    Defender("Pelindung"),
    Attacker("Penyerang"),
    Healer("Penyembuh");

    private String Deskripsi;
//
    Tipe(String deskripsi){
        this.Deskripsi = deskripsi;
    }
//        
    public String getDeskripsi(){
        return this.Deskripsi;
    }
} 

enum Rarity{
    C("Common"),
    R("Rare"),
    SR("Super Rare"),
    UR("Ultra Rare"),
    SSR("Super Super Rarec");
    
    private String Deskripsi;
    
    Rarity(String deskripsi){
        this.Deskripsi = deskripsi;
    }
}

/**
 *
 * @author kuma
 */
public class Karakter extends Talent implements Skill{
    Tipe tipe;
    Rarity rarity;
    private double Health, Attack, Defense;
    
    public Tipe getTipe(){
        return this.tipe;
    }
    
    public Rarity getRarity(){
        return this.rarity;
    }
    
    public void setTipe(Tipe tipe){
        this.tipe = tipe;
    }
    
//    public void getDefender(){
//        System.out.println(Tipe.Defender);
//    }
    
    public double getAttack(){
        return this.Attack;
    }
    
    public double getHealth(){
        return this.Health;
    }
    
    public double getDefense(){
        return this.Defense;
    }
    
    @Override
    public void Passive(){
        Tipe k = this.getTipe();
        switch(k){
            case Healer -> this.Health *= 1.5;
            case Attacker -> this.Attack *= 1.5;
            case Defender -> this.Defense *= 1.5;
        }
    }
    
    @Override
    public void Skill1(Karakter karakter){
        double a = karakter.getHealth();
        karakter.setHealth(a * 1.5);
    }
    
    @Override
    public void Skill2(Karakter karakter){
        for(int i = 0; i < 4; i++){
            karakter.Serang(karakter);
        } //sebenernya sama dengan serang 4*
    }
    
    @Override
    public void Skill3(){
        this.Health *= 1.5;
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
        karakter.Health -= this.Attack * 0.2;
    }
    
    @Override
    public void Heal(){
        this.Health += this.Attack * 0.5;
    }
    
    public void setAttack(double attack){
        this.Attack = attack;
    }
    
    public void setDefense(double defense){
        this.Defense = defense;
    }
}
