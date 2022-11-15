/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal2;

/**
 *
 * @author LENOVO
 */
import java.util.*;

public class Main2 {
    public static void main(String[] args){
        int inputuser;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilih buku yang ingin diinputkan:");
        System.out.println("1 = Novel");
        System.out.println("2 = Komik");
        System.out.println("Masukkan pilihan: ");
        inputuser = input.nextInt();
        input.nextLine();
        
        if(inputuser == 1){
            String judul;
            String penulis;
            String tahun;
            String genre;
            String sinopsis;
            
            System.out.print("Judul: ");
            judul = input.nextLine();
            
            System.out.print("Penulis: ");
            penulis = input.nextLine();
            
            System.out.print("Tahun Terbit: ");
            tahun = input.nextLine();
            
            System.out.print("Genre: ");
            genre = input.nextLine();
            
            System.out.print("Sinopsis: ");
            sinopsis = input.nextLine();
            
            Novel2 novel = new Novel2(judul, penulis, tahun, genre, sinopsis);
            System.out.println(novel.getNovel2Detail());
        } else if (inputuser == 2){
            String judul;
            String penulis;
            String tahun;
            int volume;
            String sinopsis;
            
            System.out.print("Judul: ");
            judul = input.nextLine();
            
            System.out.print("Penulis: ");
            penulis = input.nextLine();
            
            System.out.print("Tahun Terbit: ");
            tahun = input.nextLine();
            
            System.out.print("Genre: ");
            volume = input.nextInt();
            input.nextLine();
            
            System.out.print("Sinopsis: ");
            sinopsis = input.nextLine();
            
            Komik2 komik = new Komik2(judul, penulis, tahun, volume, sinopsis);
            System.out.println(komik.getKomik2Detail());
        }
    }
}
