/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal2;

/**
 *
 * @author LENOVO
 */

import java.util.*;

public class Negara {
    String negara;
    String kepemimpinan;
    String presiden;
    int tanggalKemerdekaan;
    int bulanKemerdekaan;
    int tahunKemerdekaan;
    
    public Negara(String negara, String kepemimpinan, String presiden, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan){
        this.negara = negara;
        this.kepemimpinan = kepemimpinan;
        this.presiden = presiden;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }
    
    public int getbulan(){
        return bulanKemerdekaan;
    }
    
    void getData(){
        Scanner input= new Scanner(System.in);
        negara = input.nextLine();
        kepemimpinan = input.nextLine();
        presiden = input.nextLine();
        
        if(!(kepemimpinan.equalsIgnoreCase("monarki"))){
           tanggalKemerdekaan = input.nextInt();
           bulanKemerdekaan = input.nextInt();
           tahunKemerdekaan = input.nextInt();
        }
    }
    
    void tampilkan(){
        HashMap<Integer, String> month = new HashMap<Integer, String>();
        month.put(1, "Januari");
        month.put(2, "Februari");
        month.put(3, "Maret");
        month.put(4, "April");
        month.put(5, "Mei");
        month.put(6, "Juni");
        month.put(7, "Juli");
        month.put(8, "Agustus");
        month.put(9, "September");
        month.put(10, "Oktober");
        month.put(11, "November");
        month.put(12, "Desember");
        
        if(kepemimpinan.equalsIgnoreCase("monarki")){
            System.out.println("Negara " + negara + " mempunyai Raja bernama " + presiden + "\n");
        }
        else if (kepemimpinan.equalsIgnoreCase("presiden")){
            System.out.println("Negara " + negara + " mempunyai Presiden bernama " + presiden);
        }
        else if (kepemimpinan.equalsIgnoreCase("perdana menteri")){
            System.out.println("Negara " + negara + " mempunyai Perdana Menteri bernama " + presiden);
        }
        
        if(kepemimpinan.equalsIgnoreCase("presiden")||kepemimpinan.equalsIgnoreCase("perdana menteri")){
            System.out.println("Deklarasi Kemerdekaan pada tanggal " + tanggalKemerdekaan + " " + month.get(getbulan()) + " " + tahunKemerdekaan + "\n");
        }
    }
}