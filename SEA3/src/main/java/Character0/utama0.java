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
    }
    
    private void Display(){
        String hp = (int) satu.getHealth()+"";
        System.out.println(hp);
    }
    
    private void DisplayStockItem(){
        String stock = (int) potion.getStock()+"";
        System.out.println(stock);
    }
    
    public utama0(){
        Setting();
        DisplayStockItem();
        
//        Display();
//        satu.UseItem_PotionKecil(potion);
//        satu.Defend(satu);
//        satu.Serang(satu);
//        satu.Heal();
//        satu.Serang(satu);
        DisplayStockItem();
//        Display();
    }
    
    public static void main(String[] args){
        new utama0();
    }
}
