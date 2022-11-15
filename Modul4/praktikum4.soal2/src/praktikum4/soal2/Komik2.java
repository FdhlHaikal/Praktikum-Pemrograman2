/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal2;

/**
 *
 * @author LENOVO
 */
public class Komik2 extends Buku2{
    private int volume;
    private String sinopsis;
    
    public Komik2(String judul, String penulis, String tahun, int volume, String sinopsis){
        super.judul = judul;
        super.penulis = penulis;
        super.tahun = Integer.valueOf(tahun);
        this.volume = volume;
        this.sinopsis = sinopsis;
    }
    
    String getKomik2Detail(){
        return "Data yang baru diinputkan adalah \n" + "Sebuah komik berjudul \"" + judul + "\".\n" + "Komik tersebut dibuat oleh " + penulis + " dan diterbitkan pada tahun " + tahun + ".\n" + "Sampai saat ini komik tersebut memiliki jumlah volume sebanyak " + volume + "Sinopsis : " + sinopsis.substring(0, 64) + "...";
    }
}
