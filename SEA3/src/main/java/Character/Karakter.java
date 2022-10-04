/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character;

/**
 *
 * @author kuma
 */
public class Karakter implements State{
    private double MaxHealth;
    private double Attack;
    private double Defense;
    private double Health;

    /**
     * @return the MaxHealth
     */
    public double getMaxHealth() {
        return MaxHealth;
    }
    
    /**
     * Fungsi Heal karakter berfungsi untuk menambah Health karakter
     * @param karakter, karakter yang ingin diheal
     */
    @Override
    public void Heal(){
        this.Health += this.Attack * 0.5;
//        this.setHealth(this.getHealth() + atk);
    }
   
    /**
     * Fungsi Defend berfungsi untuk mengurangi DAMAGE yang diterima oleh karakter
     * @param karakter1 karakter yang diserang, 
     * @param karakter2 karakter yang menyerang
     */
    @Override
    public void Defend(Karakter karakter){
        this.Health -= karakter.Attack * 0.5;
    }
    
    /**
     * Fungsi Attack berfungsi untuk menyerang karakter tertentu
     * @param karakter, karakter yang ingin diserang
     */
    @Override
    public void Attack(Karakter karakter){
        karakter.setHealth(this.getAttack());
//        karakter.Health -= this.Attack;
    }

    /**
     * @param MaxHealth the MaxHealth to set
     */
    public void setMaxHealth(double MaxHealth) {
        this.MaxHealth = MaxHealth;
    }

    /**
     * @return the Attack
     */
    public double getAttack() {
        return Attack;
    }

    /**
     * @param Attack the Attack to set
     */
    public void setAttack(double Attack) {
        this.Attack = Attack;
    }

    /**
     * @return the Defense
     */
    public double getDefense() {
        return Defense;
    }

    /**
     * @param Defense the Defense to set
     */
    public void setDefense(double Defense) {
        this.Defense = Defense;
    }

    /**
     * @return the Health
     */
    public double getHealth() {
        return Health;
    }

    /**
     * @param Health the Health to set
     */
    public void setHealth(double Health) {
        this.Health = Health;
    }
    
    
}
