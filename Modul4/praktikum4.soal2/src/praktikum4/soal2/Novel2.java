/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal2;

/**
 *
 * @author LENOVO
 */
public class Novel2 extends Buku2{
    private String genre;
    private String sinopsis;
    
    public Novel2(String judul, String penulis, String tahun, String genre, String sinopsis){
        super.judul = judul;
        super.penulis = penulis;
        super.tahun = Integer.valueOf(tahun);
        this.genre = genre;
        this.sinopsis = sinopsis;
    }
    
    String getNovel2Detail(){
        return "Data yang baru diinputkan adalah \n" + "Sebuah novel bergenre " + genre + " dengan judul \"" + judul + "\".\n" + "Novel tersebut ditulis oleh " + penulis + "dan diterbitkan pada tahun " + tahun + ".\n" + "Sinopsis : " + sinopsis.substring(0, 59) + "...";
    }
}
