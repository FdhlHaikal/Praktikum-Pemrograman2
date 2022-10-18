/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak103_2110817310015_m.fadhil.haikal.wardani;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class PRAK103_2110817310015_MFadhilHaikalWardani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int inputUser, i = 1, nilai;
        
        Scanner keyboard = new Scanner(System.in);
        
        inputUser = keyboard.nextInt();
        nilai = inputUser;
        
        do {
            if(nilai % 7 == 0){
                System.out.println(" ");
            } else {
                System.out.print(nilai);
                nilai -= 1;
            }
            if(i < 5) {
                System.out.print(", ");
            }
            i++;
        } while (i < 6);
        System.out.println("");
    }
    
}
