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

public class NegaraMain {
    public static void main(String[] args){
        String negara = "";
        String kepemimpinan = "";
        String presiden = "";
        int tanggalKemerdekaan = 0;
        int bulanKemerdekaan = 0;
        int tahunKemerdekaan = 0;
        
        Scanner input = new Scanner(System.in);
        
        LinkedList<Negara> ObjNegara = new LinkedList<Negara>();
        
        int inputUser = input.nextInt();
        
        for (int i = 0; i< inputUser; i++){
            Negara infoNegara = new Negara(negara, kepemimpinan, presiden, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            infoNegara.getData();
            ObjNegara.add(infoNegara);
        }
        
        for(int i = 0; i < ObjNegara.size(); i++){
            Negara Cetak = ObjNegara.get(i);
            Cetak.tampilkan();
        }
    }
}
