/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.seania.frame;

import javax.swing.*;

/**
 *
 * @author kuma
 */
public class CobaFrame extends JFrame{
    public CobaFrame(){
        JFrame j = new JFrame("Frame 1");
//        setExtendedState(CobaFrame.MAXIMIZED_BOTH);
        j.setSize(400, 400);
        j.setDefaultCloseOperation(CobaFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        JButton b = new JButton("Tekan Saya");
//        b.setSize(100, 50);
        b.setBounds(30, 30, 100, 40);
        b.setVisible(true);
        j.add(b);
    }
    
    public static void main(String[] args){
        new CobaFrame();
    }
    
}
