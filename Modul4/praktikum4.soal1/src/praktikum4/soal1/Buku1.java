/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal1;

/**
 *
 * @author LENOVO
 */
public class Buku1 {
    private String judul;
    private String penulis;
    private int tahun;
    
    public Buku1(String judul, String penulis, int tahun){
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }
    
    void display(){
        System.out.println("Detail Buku: ");
        System.out.println("Judul adalah " + this.judul);
        System.out.println("Penulis adalah " + this.penulis);
        System.out.println("Tahun Terbit adalah " + this.tahun);
    }
}
