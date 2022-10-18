/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak203.pkg2110817310015.m.fadhil.haikal.wardani;

/**
 *
 * @author LENOVO
 */
public class Pegawai {
    public String nama;
    public String asal;
    public String jabatan;
    public int umur;
    
    public String getNama(){
        return nama;
    }
    
    public String getAsal(){ /*Tipe data char tidak bisa di konfersikan ke String*/
        return asal;
    }
    
    public void setJabatan(String jabatan){ /*dalam kurung tidak diisi "(String jabatan)"*/
        this.jabatan = jabatan; /*variabel j tidak dapat dipanggil dikarenakan tidak ada di inisialisasi*/
    }
    
    public String getJabatan(){
        return this.jabatan;
    }
    
    public int getUmur(){
        return umur;
    }
}
