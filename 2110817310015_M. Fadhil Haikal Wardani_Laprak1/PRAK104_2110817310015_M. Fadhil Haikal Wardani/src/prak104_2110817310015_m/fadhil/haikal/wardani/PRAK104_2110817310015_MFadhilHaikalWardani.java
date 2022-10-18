/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak104_2110817310015_m.fadhil.haikal.wardani;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class PRAK104_2110817310015_MFadhilHaikalWardani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] Andi = new int[3];
        int[] Budi = new int[3];
        int skorAndi = 0;
        int skorBudi = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Kartu Andi: ");
        for (int i = 0; i<3; i++){
            Andi[i] = keyboard.nextInt();
        }
        
        System.out.print("Kartu Budi: ");
        for (int i = 0; i<3; i++){
            Budi[i] = keyboard.nextInt();
        }
        
        for(int i = 0; i<3; i++){
            if(Andi[i]>Budi[i]){
                skorAndi++;
            }else if(Budi[i]>Andi[i]){
                skorBudi++;
            }
        }
        
        if(skorAndi > skorBudi){
            System.out.println("Andi");
        } else if (skorBudi > skorAndi){
            System.out.println("Budi");
        } else {
            System.out.println("Seri");
        }
    }
    
}
