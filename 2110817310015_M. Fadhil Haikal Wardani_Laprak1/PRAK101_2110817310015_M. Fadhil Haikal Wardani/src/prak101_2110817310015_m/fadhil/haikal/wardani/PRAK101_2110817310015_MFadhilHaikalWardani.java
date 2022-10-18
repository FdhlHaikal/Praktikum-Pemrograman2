/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak101_2110817310015_m.fadhil.haikal.wardani;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class PRAK101_2110817310015_MFadhilHaikalWardani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Data Telah Ditambahkan,");
        
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = scanner.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = scanner.nextInt();
        
        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = scanner.nextInt();
        String bulan = null;
        
        if (bulanLahir == 1){
            bulan = "Januari";
        } else if (bulanLahir == 2){
            bulan = "Februari";
        } else if (bulanLahir == 3){
            bulan = "Maret";
        } else if (bulanLahir == 4){
            bulan = "April";
        } else if (bulanLahir == 5){
            bulan = "Mei";
        } else if (bulanLahir == 6){
            bulan = "Juni";
        } else if (bulanLahir == 7){
            bulan = "Juli";
        } else if (bulanLahir == 8){
            bulan = "Agustus";
        } else if (bulanLahir == 9){
            bulan = "September";
        } else if (bulanLahir == 10){
            bulan = "Oktober";
        } else if (bulanLahir == 11){
            bulan = "November";
        } else if (bulanLahir == 12){
            bulan = "Desember";
        }
        
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();
        
        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = scanner.nextInt();
        
        System.out.print("Masukkan Berat Badan: ");
        float beratBadan = scanner.nextFloat();
        
        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir + " " + bulan + " " + tahunLahir + " Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");
        // TODO code application logic here
    }
    
}
