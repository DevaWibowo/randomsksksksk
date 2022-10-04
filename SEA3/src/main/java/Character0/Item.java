/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Character0;

/**
 *
 * @author kuma
 */
public class Item {
    int Stock;
    
    public double IsiPotionKecil(){
        return 20;
    }
    
    public double IsiPotionSedang(){
        return 50;
    }
    
    public double IsiPotionBesar(){
        return 100;
    }
    
    public int getStock(){
        return this.Stock;
    }
    
    public void tambahStock(int jumlah){
        this.Stock += jumlah;
    }
    
    public void kurangStock(int jumlah){
        this.Stock -= jumlah;
    }
    
    public void UsePotion(Karakter karakter){
        karakter.TambahHealth(IsiPotionKecil());
    }
}
