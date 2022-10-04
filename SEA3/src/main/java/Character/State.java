/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Character;

/**
 *
 * @author kuma
 */
public interface State {
    public void Attack(Karakter karakter);
    public void Defend(Karakter karakter);
    public void Heal();
}
