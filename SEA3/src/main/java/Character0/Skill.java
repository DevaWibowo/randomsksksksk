/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Character0;

/**
 *
 * @author kuma
 */
public interface Skill {
    // Basic Behaviour of Character
    public void Serang(Karakter karakter);
    public void Heal();
    public void Defend(Karakter karakter);
    
    // Skills and Passives
    public void Passive();
    public void Skill1(Karakter karakter);
    //adaptasi skill wizard dari dice hunter
    public void Skill2(Karakter karakter);
    public void Skill3();
    
    // dump
//    public void UseItem(Item item);
}
