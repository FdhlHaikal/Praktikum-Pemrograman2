/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak201.pkg2110817310015.m.fadhil.haikal.wardani;

/**
 *
 * @author LENOVO
 */
public class Mangga {
    String nama;
    double berat;
    int harga;
    int jumlah;
    
    Mangga(String namaMangga, double beratMangga, int hargaMangga, int jumlahMangga){
        this.nama = namaMangga;
        this.berat = beratMangga;
        this.harga = hargaMangga;
        this.jumlah = jumlahMangga;
        
        System.out.println("Nama Mangga: " + this.nama);
        System.out.println("Berat: " + this.berat + " kg");
        System.out.println("Jumlah Beli: " + this.jumlah);
        System.out.println("Total berat: " + this.berat * this.jumlah + " kg");
        System.out.println("Total harga: Rp." + this.harga * this.jumlah);
        System.out.println(" ");
    }
}
