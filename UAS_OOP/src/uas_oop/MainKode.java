package uas_oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainKode {
    public static void main (String[] args){
        JFrame frame = new JFrame ("UAS OOP");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        JButton klik = new JButton("RUN");
        frame.add(klik);
        
        klik.addActionListener (new ActionListener(){
            @Override
            public void actionPerformed( ActionEvent e){
                DataPribadi DataPribadi = new DataPribadi ("Dwi Agus Haryanto", 312110033, 23);
                DataPribadi.getInfo();
                Program Program = new Program("Teknik Informatika", 3);
                Program.setDataPribadi(DataPribadi);
                
                System.out.println("Program Studi : " +Program.getNama());
                System.out.println("Semester : 3 "Program.getSem());
            }
        });
        
        frame.setVisible(true);
    }
}