/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character0;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author kuma
 */
public class S0 {
    DecimalFormat df = new DecimalFormat("####");
    Karakter Penyerang = new Karakter();
    Karakter Camelion = new Karakter();
    
    Scanner sc = new Scanner(System.in);
    String s;
    
    private void PrologueScene(){
        System.out.println("===============");
        System.out.println("Sang Penyerang tersungkur, menyeka peluh di pelipis.");
        System.out.println("Sang Penyerang: 'Huh, baiklah, Aku tau semua pergerakan mu!!'");
        System.out.println();
        System.out.println("Kamu akan berhadapan dengan Cameleon!!");
        System.out.print("Masukkan T untuk Tutorial dan C untuk langsung bertarung: ");
        Scene();
    }
    
    private void Scene(){
        s = sc.nextLine().toLowerCase();
        switch(s){
            case "t" -> Tutorial();
            case "c" -> PrologCommand();
            default -> {
                System.out.println();
            }
        }
    }
    
    private void SettingPlayer(){
        Penyerang.setAttack(20);
        Penyerang.setHealth(100);
        Camelion.setDefense(50);
        Penyerang.setTipe(Tipe.Attacker);
        Penyerang.Passive();
    }
    
    private void SettingOpp(){
        Camelion.setAttack(15);
        Camelion.setHealth(200);
        Camelion.setDefense(100);
        Camelion.setTipe(Tipe.Defender);
        Camelion.Passive();
    }
    
    double hp, atk, def;
    private void DisplayStatPlayer(){
        hp = Penyerang.getHealth();
        atk = Penyerang.getAttack();
        def = Penyerang.getDefense();
        
        System.out.println("====================");
        System.out.println("Health Player: " + df.format(hp));
        System.out.println("Attack Player: " + df.format(atk));
        System.out.println("Defense Player: " + df.format(def));
        System.out.println();
    }
    
    private void DisplayStatMusuh(){
        hp = Camelion.getHealth();
        atk = Camelion.getAttack();
        def = Camelion.getDefense();
        
        System.out.println("====================");
        System.out.println("Health Musuh : " + df.format(hp));
        System.out.println("Attack Musuh: " + df.format(atk));
        System.out.println("Defense Musuh: " + df.format(def));
        System.out.println();
    }
    
    private void DisplayStat(){
        DisplayStatPlayer();
        DisplayStatMusuh();
    }
    
    private void Setting(){
        SettingPlayer();
        SettingOpp();
    }
    
    private void Redirect(){
        new S1();
    }
    
    private void PrologS0(){
        System.out.println("================");
        System.out.print("Masukkan a / b: ");
    }
    
    public S0(){
        Setting();
        PrologueScene();
//        s = sc.nextLine();
//        
//        switch(s){
//            case "a" -> Redirect();
//            case "b" -> System.out.println("Kondisi lain");
//            default -> {
//                System.out.print("Masukkan a / b: ");
//                new S0();
//            }
//        }
//        Setting();
//        DisplayStat();
//        System.out.println("===============");
//        System.out.println("Sang Penyerang tersungkur, menyeka peluh di pelipis.");
//        System.out.println("Sang Penyerang: 'Huh, baiklah, Aku tau semua pergerakan mu!!'");
//        System.out.println();
//        System.out.println("Ketik t untuk mengakses tutorial, c untuk langsung bertarung");
//        System.out.print("Masukkan perintah: ");
//        System.out.println();
//        
//        s = sc.nextLine().toLowerCase();
//        switch(s){
//            case "t" -> Tutorial();
//            case "c" -> PrologCommand();
//        }
    }
    
    private void Tutorial(){
        System.out.println("==============================================");
        System.out.println("Hawooo, Kamu baru saja mengakses menu tutorial");
        System.out.println("Haa, kenapa Kamu mengakses menu ini?");
        System.out.println("Apa lagi jika bukan belum tau cara bermain, mwahahaha");
        System.out.println();
        // Genshin Impact reference: Cyrus from Adventurer Guild
        System.out.println("Nama ku Cyrus, Aku akan memberitahumu dasar-dasar bertarung di dunia ini");
        System.out.println("Ketik s untuk menyerang musuhmu!");
        System.out.println("Menyerang akan mengurangi hitpoint musuh.");
        System.out.println();
        System.out.println("Ketik d untuk menahan serangan musuh.");
        System.out.println("Menahan akan mengurangi kerusakan sebanyak 50%");
        System.out.println();
        System.out.println("Ketik h untuk menyembuhkan hitpoint");
        System.out.println("Menyembuhkan akan menambah hitpoint");
        System.out.println();
        System.out.println("Bagaimana? Sudah paham?");
        System.out.print("Ketik t untuk membaca tutorial lagi atau ketik c untuk lanjut: ");
        PerintahTutorial();
    }
    
    private void PerintahTutorial(){
        s = sc.nextLine().toLowerCase();
        switch(s){
            case "t" -> Tutorial();
            case "c" -> PrologCommand();
            default -> {
                System.out.print("Harap masukkan T/C: " );
                PerintahTutorial();
            }
        }
    }
    
    private void PrologCommand(){
        System.out.println();
        System.out.println("===========================");
        System.out.println("S/Serang, D/Defense, H/Heal");
        System.out.print("Masukkan perintah: ");
        Command();
    }
    
    private void Command(){
        s = sc.nextLine().toLowerCase();
        
        if(null == s){
            System.out.print("Harap masukkan S/D/H: ");
            Command();
        }else switch (s) {
            case "s" -> {
                Penyerang.Serang(Camelion);
                System.out.println("Kamu telah menyerang Camelion");
                Command();
            }
            case "d" -> {
                Penyerang.Defend(Camelion);
                System.out.println("Kamu menahan serangan Camelion");
                Command();
            }
            case "h" -> {
                Penyerang.Heal();
                System.out.println("Kamu menyembuhkan diri");
                Command();
            }
            default -> {
                System.out.print("Harap masukkan S/D/H: ");
                Command();
            }
        }
    }
    
    public static void main(String[] args){
        new S0();
    }
}
