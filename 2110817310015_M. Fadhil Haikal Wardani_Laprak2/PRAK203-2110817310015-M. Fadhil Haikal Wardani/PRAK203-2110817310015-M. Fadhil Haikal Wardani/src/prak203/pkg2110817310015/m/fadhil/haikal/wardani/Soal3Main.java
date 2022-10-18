/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak203.pkg2110817310015.m.fadhil.haikal.wardani;

/**
 *
 * @author LENOVO
 */
public class Soal3Main {
    public static void main(String[]args){
        Pegawai p1 = new Pegawai();
        p1.nama = "Roi"; /*kurang tanda ";" pada akhir kalimat*/
        p1.asal = "Kingdom of Orvel"; /*tipe data string tidak bisa di konfersikan ke char*/
        p1.setJabatan("Assasin"); /*tidak ada pemanggilan "getJabatan" pada file pegawai*/
        p1.umur = 17;
        
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun"); /*tidak bisa di run karena tidak ada pemanggilan "umur"*/
    }
}
