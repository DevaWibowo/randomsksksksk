/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seania.armor;

/**
 *
 * @author kuma
 */
public class Armor {
    private String Nama;
    private boolean Digunakan;
    private int Jumlah;
    private double HealthTambahan;
    
    Armor baju = new Armor("Baju", false, 30);
    
    public Armor(String nama, boolean digunakan, double healthtambahan){
        this.Nama = nama;
        this.Digunakan = digunakan;
        this.HealthTambahan = healthtambahan;
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
     * @return the Digunakan
     */
    public boolean isDigunakan() {
        return Digunakan;
    }

    /**
     * @param Digunakan the Digunakan to set
     */
    public void setDigunakan(boolean Digunakan) {
        this.Digunakan = Digunakan;
    }

    /**
     * @return the Jumlah
     */
    public int getJumlah() {
        return Jumlah;
    }

    /**
     * @param Jumlah the Jumlah to set
     */
    public void setJumlah(int Jumlah) {
        this.Jumlah = Jumlah;
    }

    /**
     * @return the HealthTambahan
     */
    public double getHealthTambahan() {
        return HealthTambahan;
    }

    /**
     * @param HealthTambahan the HealthTambahan to set
     */
    public void setHealthTambahan(double HealthTambahan) {
        this.HealthTambahan = HealthTambahan;
    }   
}