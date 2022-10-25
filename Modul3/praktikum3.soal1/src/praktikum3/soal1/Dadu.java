/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal1;

/**
 *
 * @author LENOVO
 */

import java.util.LinkedList;

public class Dadu {
    int inputUser;
    int total;
    
    LinkedList<Integer> ObjDadu = new LinkedList<>();
    
    void setInput(int input){
        this.inputUser = input;
    }
    
    void nilai(){
        for (int i = 1; i <= this.inputUser; i++){
            int nilai = 1 + (int)(Math.random()*6);
            
            ObjDadu.add(nilai);
            
            this.total = this.total + nilai;
        }
    }
    
    void cetak(){
        for(int i = 1; i <= this.inputUser; i++){
            System.out.println("Dadu ke-" + i + " bernilai " + ObjDadu.get(i-1));
        }
        
        System.out.println("Total nilai dadu keseluruhan " + this.total);
    }
}
