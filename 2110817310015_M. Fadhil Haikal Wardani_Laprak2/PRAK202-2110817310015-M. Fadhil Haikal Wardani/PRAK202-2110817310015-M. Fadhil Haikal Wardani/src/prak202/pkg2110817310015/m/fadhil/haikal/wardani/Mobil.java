/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak202.pkg2110817310015.m.fadhil.haikal.wardani;

/**
 *
 * @author LENOVO
 */
public class Mobil {
    String merek;
    String tahun_keluaran;
    int kapasitas;
    int harga;
    String pemilik;
    
    void info(){
        System.out.println("Merek Mobil: " + this.merek);
        System.out.println("Harga: Rp." + this.harga);
        System.out.println("Tahun Keluaran: " + this.tahun_keluaran);
        System.out.println("Kapasitas: " + this.kapasitas);
    }
    
    void setPemilik(String pemilik){
        this.pemilik = pemilik;
    }
    
    String getPemilik(){
        return this.pemilik;
    }
    
    int getPajak(){
        return this.harga * 2/100;
    }
    
    String getMerek(){
        return this.merek;
    }
    
    String getTahun_Keluaran(){
        return this.tahun_keluaran;
    }
    
    int getKapasitas(){
        return this.kapasitas;
    }
    
    int getHarga(){
        return this.harga;
    }
}
