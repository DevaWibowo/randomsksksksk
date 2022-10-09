/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character;

/**
 *
 * @author kuma
 */
public class Karakter implements Skill{
    private String Nama;
    private double Health;
    private double Attack;
    private double Defense;
    
    public Karakter(String nama, double health, double attack, double defense){
        this.Nama = nama;
        this.Health = health;
        this.Attack = attack;
        this.Defense = defense;
    }
    
    // Method Serang
    public void Serang(Karakter karakter){
        karakter.Health -= this.Attack * 0.2;
    }
    
    public void Defense(Karakter karakter){
        this.Health -= karakter.Attack * 0.5;
    }
    
    public void Heal(){
        this.Health += this.Attack * 0.2;
    }

    /**
     * @return the Nama
     */
    public String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
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
    
    
}
