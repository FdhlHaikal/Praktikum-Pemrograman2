/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak105_2110817310015_m.fadhil.haikkal.wardani;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class PRAK105_2110817310015_MFadhilHaikkalWardani {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double hasil, r, t;
        double phi = 3.14;
        
        System.out.print("Masukkan jari-jari: ");
        r = input.nextDouble();
        
        System.out.print("Masukkan tinggi: ");
        t = input.nextDouble();
        
        hasil = (phi * r * r * t);
        
        System.out.println("Volume tabung dengan jari-jari " + r + " cm dan tinggi " + t + " cm adalah " + hasil + " m3");
    }
    
}
