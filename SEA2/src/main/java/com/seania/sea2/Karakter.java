/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seania.sea2;

/**
 *
 * @author kuma
 */
public class Karakter {
    private String Nama;
    private double Health, Attack, MaxHealth;
    private boolean Turn;
    private int Counter;
    
    public int getCounter(){
        return this.Counter;
    }
    
    public void setCounter(int counter){
        this.Counter = counter;
    }
    
    public void setTurn(boolean turn){
        this.Turn = turn;
    }
    
    public boolean getTurn(){
        return Turn;
    }
    
    public void Lifesteal(Karakter karakter){
        karakter.Health -= this.Attack;
        this.tambahHealth(this.Attack);
    }
    
    public Karakter(String nama, double health, double attack, double maxhealth, boolean turn){
        this.Nama = nama;
        this.Health = health;
        this.Attack = attack;
        this.MaxHealth = maxhealth;
        this.Turn = turn;
    }
    
    public void Serang(Karakter karakter){
        karakter.Health -= this.Attack;
    }
    
    public void Heal(){
        this.Health += this.Attack + 50;
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
    
    public void kurangHP(double hp){
        this.Health -= hp;
    }
    
    public void tambahHealth(double hp){
        this.Health += hp;
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
     * @return the MaxHealth
     */
    public double getMaxHealth() {
        return MaxHealth;
    }

    /**
     * @param MaxHealth the MaxHealth to set
     */
    public void setMaxHealth(double MaxHealth) {
        this.MaxHealth = MaxHealth;
    }
}
