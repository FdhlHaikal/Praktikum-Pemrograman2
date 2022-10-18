/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak102_2110817310015_m.fadhil.haikal.wardani;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class PRAK102_2110817310015_MFadhilHaikalWardani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inputUser, i = 1;
        
        Scanner keyboard = new Scanner(System.in);
        
        inputUser = keyboard.nextInt();
        int cek1 = inputUser;
        
        while(i < 8){
            if(inputUser % 2 == 0){
                if (i == 1){
                    cek1 = ( inputUser / 2 ) - 1;
                    System.out.print(cek1);
                } else if (i % 2 == 1){
                    cek1 /= 2;
                    System.out.print(cek1);
                } else {
                    cek1 = (cek1 * 2) + 3;
                    System.out.print(cek1);
                }
            } else {
                if (i == 1){
                    System.out.print(cek1);
                } else if(i % 2 == 1){
                    cek1 = (cek1 * 2) + 3;
                    System.out.print(cek1);
                }else {
                    cek1 /= 2;
                    System.out.print(cek1);
                }
            }
            if(1 < 7){
                System.out.print(", ");
            }
            i = i + 1;
        }
        System.out.println("");
    }
    
}
