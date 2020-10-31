/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan28.gantikata;
import java.util.Scanner;

/**
 *
 * @author Acer
 * Nama     : Agus Deri Dermawan
 * Kelas    : IF1
 * NIM      : 10119040
 * profram mengganti kata dalam kalimat yang di inputkan
 */
public class IF110119040Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat, kata, ubah;
        Scanner input = new Scanner(System.in);
        System.out.println("=======Program Mengganti Kata========");
        System.out.println();
        
        System.out.print("Masukan Kalimat :");
        kalimat = input.nextLine();
        
        System.out.print("Ganti Kata : ");
        kata = input.next();
        
        System.out.print("Menjadi Kata : ");
        ubah = input.next();
        
        System.out.println();
        System.out.println("============Hasil Program============");
        System.out.println("Kalimat Awal : " + kalimat);
        System.out.println("Kalimat Baru : " + kalimat.replace(kata, ubah));
        System.out.println();
        
        
    }
    
}
