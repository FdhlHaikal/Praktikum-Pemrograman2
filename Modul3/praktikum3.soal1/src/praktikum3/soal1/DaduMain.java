/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal1;

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;

public class DaduMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Dadu daduAcak = new Dadu();
        
        int inputUser = input.nextInt();
        
        daduAcak.setInput(inputUser);
        
        daduAcak.nilai();
        daduAcak.cetak();
    }
}
