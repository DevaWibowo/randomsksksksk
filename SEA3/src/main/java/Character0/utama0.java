/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character0;

/**
 *
 * @author kuma
 */
public class utama0 {
    Karakter satu = new Karakter();
    Potion potion = new Potion();
    
    private void Setting(){
        satu.setAttack(10);
        satu.setHealth(20);
        potion.tambahStock(5);
        satu.setTipe(Tipe.Attacker);
    }
    
    private void Display(){
        String hp = (int) satu.getHealth()+"";
        String atk = (int) satu.getAttack()+"";
        String def = (int) satu.getDefense()+"";
        System.out.println("ATK: " + atk);
        System.out.println("HP: " +hp);
        System.out.println("DEF: " + def);
        System.out.println("==================");
    }
    
    private void DisplayStockItem(){
        String stock = (int) potion.getStock()+"";
        System.out.println(stock);
    }
    
    public utama0(){
//        Setting();
//        for(Tipe t : Tipe.values()){
//            System.out.println(t.getDeskripsi());
//        }
//        Display();
        Tipe s = Tipe.Attacker;
        satu.setTipe(Tipe.Healer);
        System.out.println(satu.getTipe());
//        satu.Passive();
//        System.out.println(satu.getTipe());
//        if(satu.getTipe() == Tipe.Attacker){
//            System.out.println("Ini adalah Attacker");
//        }else{
//            System.out.println("Ini bukanlah Attacker");
//        }
//        satu.Skill2(satu);
//        DisplayStockItem();
//        satu.UseItem_PotionKecil(potion);
//        satu.Defend(satu);
//        satu.Serang(satu);
//        satu.Heal();
//        satu.Serang(satu);
//        DisplayStockItem();
//        Display();
    }
    
    public static void main(String[] args){
        new utama0();
    }
}
