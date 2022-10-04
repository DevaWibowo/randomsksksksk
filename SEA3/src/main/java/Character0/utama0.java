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
    Item Potion = new Item();
    
    private void Setting(){
        satu.setAttack(10);
        satu.setHealth(20);
    }
    
    private void Display(){
        String hp = (int) satu.getHealth()+"";
        System.out.println(hp);
    }
    
    public utama0(){
        Setting();
        Display();
        satu.UseItem_PotionBesar();
//        satu.Defend(satu);
//        satu.Serang(satu);
//        satu.Heal();
//        satu.Serang(satu);
        Display();
    }
    
    public static void main(String[] args){
        new utama0();
    }
}
