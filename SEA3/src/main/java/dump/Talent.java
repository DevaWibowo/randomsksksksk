/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dump;

import Character0.Karakter;

/**
 *
 * @author kuma
 */
public class Talent implements TalentIm{
    @Override
    public void Skill1(Karakter karakter){
        double a = karakter.getHealth();
        karakter.setHealth(a * 1.5);
    }
    
    @Override
    public void Skill2(Karakter karakter){
        for(int i = 0; i < 4; i++){
            karakter.Serang(karakter);
        } //sebenernya sama dengan serang 4*
    }
}
