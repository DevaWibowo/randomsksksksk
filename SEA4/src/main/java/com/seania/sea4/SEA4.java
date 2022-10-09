/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.seania.sea4;

import Character.Karakter;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author kuma
 */
public class SEA4 {
    String hp, atk, def;
    DecimalFormat df = new DecimalFormat("####");
    Karakter Aku = new Karakter("[][][]", 100, 10, 20);
    Karakter Cameleon = new Karakter("Cameleon", 200, 20, 30);
    Scanner sc = new Scanner(System.in);
    
    private void DisplayChar(){
        hp = df.format(Aku.getHealth());
        atk = df.format(Aku.getAttack());
        def = df.format(Aku.getDefense());
        
        System.out.println(Aku.getNama());
        System.out.println("Health : " + hp);
        System.out.println("Attack : " + atk);
        System.out.println("Defense: " + def);
        System.out.println();
    }
    
    private void DisplayOpp(){
        hp = df.format(Cameleon.getHealth());
        atk = df.format(Cameleon.getAttack());
        def = df.format(Cameleon.getDefense());
        
        System.out.println(Cameleon.getNama());
        System.out.println("Health : " + hp);
        System.out.println("Attack : " + atk);
        System.out.println("Defense: " + def);
    }
    
    private void DisplayNama(){
        System.out.println(Aku.getNama());
        System.out.println(Cameleon.getNama());
    }
    
    private void S(){
        System.out.println("===============");
        System.out.println("Sang Penyerang tersungkur, menyeka peluh di pelipis.");
        System.out.println("Sang Penyerang: 'Huh, baiklah, Aku tau semua pergerakan mu!!'");
        System.out.println();
        Command();
    }
    
    private void Command(){
        String c = sc.nextLine().toLowerCase();
        System.out.print("Masukkan perintah: ");
        switch(c){
            case "s" -> System.out.println("Serang");
            case "d" -> System.out.println("Defend");
            case "h" -> System.out.println("Heal");
            default -> {
                System.out.println("Default");
                Command();
            }
        }
    }
            
    private SEA4(){
        S();
        
    }
    
    public static void main(String[] args) {
        new SEA4();
    }
}
