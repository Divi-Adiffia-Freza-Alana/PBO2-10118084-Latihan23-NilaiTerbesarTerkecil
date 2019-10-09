/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan23.nilaiterbesarterkecil;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Freza
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan Nilai terbesar dan terkecil

 */
public class PBO210118084Latihan23NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner (System.in);
        int Banyakmahasiswa;
        
        System.out.print("Masukkan Banyaknya Mahasiswa :");  
        Banyakmahasiswa=Scanner.nextInt();
        int nilai[] = new int[Banyakmahasiswa];
        for (int i = 1; i <= Banyakmahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-"+i+" :");
            nilai[i-1] = Scanner.nextInt();
        }
        System.out.println("====Hasil Nilai Mahasiswa===== ");  
        for (int i = 1; i <= Banyakmahasiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-"+i+" :"+nilai[i-1]);
                    }
        Arrays.sort(nilai);
        System.out.println("Nilai Terbesar " + nilai[1]);
        System.out.println("Nilai Terkecil " + nilai[0]);
        
    }
    
}
