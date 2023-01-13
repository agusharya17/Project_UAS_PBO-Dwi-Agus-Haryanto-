package praktikum.pkg9;

import javax.swing.*;

public class Utama{
    public static void main(String[] args){
        JFrame myFrame;
        
        myFrame = new JFrame();
        myFrame.setSize(800,700);
        myFrame.setVisible(true);
        
        JOptionPane.showMessageDialog(myFrame, "Selamat Datang di Restaurant SiMaladu");
        
        String name = JOptionPane.showInputDialog(myFrame, "Nama anda siapa: ");
        while (name.isEmpty()){
            JOptionPane.showMessageDialog(myFrame, "Dimohon untuk menginput nama anda dengan benar...");
            name = JOptionPane.showInputDialog(myFrame, "Nama anda siapa: ");
        }
        
        String yearStr = JOptionPane.showInputDialog(myFrame, "Tahun lahir: ");
        while (yearStr.isEmpty()) {
            JOptionPane.showMessageDialog(myFrame, "Dimohon untuk menginput tahun lahir anda dengan benar...");
            yearStr = JOptionPane.showInputDialog(myFrame, "Tahun lahir: ");
        }
        int year = Integer.parseInt(yearStr);
        int age = 2023 - year;
        
        
        JOptionPane.showMessageDialog(myFrame,"Hallo " + name + ",umur anda " + age +"tahun.");
        myFrame.dispose();
    }
}